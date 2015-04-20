package nl.utwente.di;

public class Quoter {

	public double getBookPrice(String book) {
		double price = 0.0;
		if (book.equals("1")) {
			price = 10.0;
		} else if (book.equals("2")) {
			price = 45.0;
		} else if (book.equals("3")) {
			price = 20.0;
		} else if (book.equals("4")) {
			price = 35.0;
		} else if (book.equals("5")) {
			price = 50.0;
		}
		return price;
	}
	
}
