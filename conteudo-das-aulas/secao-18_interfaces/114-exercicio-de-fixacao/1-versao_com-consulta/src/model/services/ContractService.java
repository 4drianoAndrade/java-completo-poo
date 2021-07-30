package model.services;

import java.util.Calendar;
import java.util.Date;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {

	private OnlinePaymentService onlinePaymentService;

	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}

	public void processContract(Contract contract, Integer months) {

		double quota = contract.getTotalValue() / months;

		for (int i = 1; i <= months; i++) {

			Date date = addMonth(contract.getDate(), i);
			double quotaSimpleInterest = quota + onlinePaymentService.monthlySimpleInterest(quota, i);
			double quotaPaymentFee = quotaSimpleInterest + onlinePaymentService.paymentFee(quotaSimpleInterest);
			contract.addInstallment(new Installment(date, quotaPaymentFee));
		}
	}

	private Date addMonth(Date date, int n) {

		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.MONTH, n);
		return cal.getTime();
	}
}
