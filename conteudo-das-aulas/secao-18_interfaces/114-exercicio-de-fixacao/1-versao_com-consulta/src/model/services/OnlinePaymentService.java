package model.services;

public interface OnlinePaymentService {

	double monthlySimpleInterest(double amount, int months);

	double paymentFee(double amount);
}
