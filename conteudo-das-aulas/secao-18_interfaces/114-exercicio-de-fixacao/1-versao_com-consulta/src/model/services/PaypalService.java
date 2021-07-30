package model.services;

public class PaypalService implements OnlinePaymentService {

	private static final double SIMPLE_INTEREST = 0.01;
	private static final double PAYMENT_FEE = 0.02;

	public double monthlySimpleInterest(double amount, int months) {

		return amount * SIMPLE_INTEREST * months;
	}

	public double paymentFee(double amount) {

		return amount * PAYMENT_FEE;
	}
}
