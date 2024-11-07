package in.co.oop;

public class Account {
	private String number;
	private String accountType;
	private double balance;

	public String getnumber() {
		return number;
	}
	public void setnumber(String number) {
		this.number=number;
	}
	public String getaccountType() {
		return accountType;
	}
	public void setaccountType(String accountType) {
		this.accountType=accountType;
	}
	public double getbalance() {
		return balance;
	}
	public void setbalance(double balance) {
		this.balance=balance;
	}

}
