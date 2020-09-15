package exceptions;

public class LowBalanceException extends Exception {
	private double amount;

	public LowBalanceException(double amount) {
		super();
		this.amount = amount;
	}

	public double getAmount() {
		return amount;
	}

	
	

}
