import java.util.Date; 

public class TestAccount {

	public static void main(String[] args) {
		
		Account a = new Account ();
		
		a.setID(1122);
		
		a.setBalance(20000);
		
		a.setAnnualInterestRate(4.5);
		
		a.withdraw(2500);
		
		a.deposit(3000);
		
		System.out.println(a.toString());
		
	}
	
}
