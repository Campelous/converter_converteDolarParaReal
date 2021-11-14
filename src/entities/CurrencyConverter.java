package entities;

public class CurrencyConverter {
	
	public final static double percentage = 6;
	public static double price;
	public static double dollars;
	
	public static double value() {
		return price * dollars;
	}
	
	public static double percentage() {
		return value() + value() / 100 * percentage;
	}
	
}
