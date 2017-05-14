import java.util.Date;
public class Account {

	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated = new Date();
	
	public Account () {
	
	}
	
	public Account (int id, double balance, double annualInterestRate, Date dateCreated) {
		
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
		this.dateCreated = dateCreated;
		
	}
	
	public int getID () {
		
		return id;
		
	}
	
	public double getBalance () {
		
		return balance;
		
	}
	
	public double getAnnualInterestRate () {
		
		return annualInterestRate;
		
	}
	
	public Date getDateCreated () {
		
		return dateCreated;

	}
	
	public void setID (int id) {
		
		this.id = id;
		
	}
	
	public void setBalance (double balance) {
		
		this.balance = balance;
		
	}
	
	public void setAnnualInterestRate (double annualInterestRate) {
		
		this.annualInterestRate = annualInterestRate;
		
	}
	
	public void setDateCreated (Date dateCreated) {
		
		this.dateCreated = dateCreated;
		
	}
	
	public double getMonthlyInterestRate () {
		
		double monthlyInterestRate = (annualInterestRate / 12);
		return monthlyInterestRate;
		
	}
	
	public void withdraw (double amount) {
		
		balance -= amount;
		
	}
	
	public void deposit (double amount) {
		
		balance += amount;
		
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", balance=" + balance + ", annualInterestRate=" + annualInterestRate
				+ ", dateCreated=" + dateCreated + "]";
	}
	
	
	
}
