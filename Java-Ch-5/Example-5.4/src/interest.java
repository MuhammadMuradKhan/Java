
public class interest {
	public static void main( String[] args ) {
		double amount; 
		 double principal = 1000.0; 
		double rate = 0.05;
		System.out.println("year"+"   "+"amount on deposit");
		for ( int year = 1; year <= 10; year++ ) {
			amount = principal * Math.pow( 1.0 + rate, year );
			System.out.println(+year+"   "+amount);
		}
	}
}