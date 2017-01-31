import java.text.DecimalFormat;

public class StockTransaction {
 
	public static void main(String[] args) {
		
		DecimalFormat formatter = new DecimalFormat("#0.00");

		final double COMMISSION_RATE = 0.02;
		int sharesPurchased = 1000;
		double purchasePrice = 32.87;
		double brokerBuy = (COMMISSION_RATE*sharesPurchased*purchasePrice);
		int sharesSold = 1000;
		double sellPrice = 33.92;
		double brokerSell = (COMMISSION_RATE*sharesSold*sellPrice);
		double purchaseTotal = (sharesPurchased*purchasePrice);
		double sellTotal = (sharesSold*sellPrice);
		double profit = ((sellTotal-brokerSell)-(purchaseTotal-brokerBuy));
		
		System.out.println("Joe paid $"+formatter.format(purchaseTotal)+" for the stock.");
		System.out.println("Joe paid his broker $"+formatter.format(brokerBuy)+" when he bought the stock.");
		System.out.println("Joe sold the stock for $"+formatter.format(sellPrice));
		System.out.println("Joe paid his broker $"+formatter.format(brokerSell)+" when he sold the stock.");
		System.out.println("Joe's total profit was $"+formatter.format(profit));
		
	}

}
