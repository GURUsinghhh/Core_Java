package in.co.oop;

public class TestAccount {
public static void main(String[] args) {
	Account a = new Account();
	a.setaccountType("saving account");
	a.setnumber("1234567890");
	a.setbalance(123000000);
	System.out.println("Account Type = " +a.getaccountType());
	System.out.println("Account Number = " +a.getnumber());
	System.out.println("Account balance = " +a.getbalance());
}
}
