import java.util.Scanner;

//Assignment: 1. Suggest the User right promo code, if user has applied a wrong one
	//		  2. Suggest the User, promo Code which delivers highest discount
	//		   2.1 if user applied invalid promo code
	//		   2.2 if user has entered d a promo code which is giving him lesser discount as compare to other


public class Assignment1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// Model
		
		int KOTAK200 = 1;
		int ICICTREATS = 2;
		
		System.out.print("Enter an amount: ");
		double amountToPay = scanner.nextDouble();
		
		if(amountToPay >= 399) {
			System.out.println("You are elibile for applying Promo Code");
			System.out.println("1. KOTAK200 for orders above Rs.399. 20% Off Upto 200");
			System.out.println("2. ICICTREATS for orders above Rs.499. Flat 20%");
			
			int promoCode = scanner.nextInt(); // either 1 or 2
			scanner.close();

			//=====================================================================================
			
			if(promoCode == ICICTREATS && amountToPay < 500) {
				System.out.println("This promo code is only valid for orders above 499");
				System.out.println("You can apply KOTAK200");
			} else if(amountToPay <= 499) {
				System.out.println("To get a discount, apply KOTAK200 promo code");
			} else if(amountToPay > 499 && promoCode == KOTAK200) {
				System.out.println("ICICTREATS will give you more discount for this amount");
			}
			
			//====================================================================================
			
			else if(promoCode == ICICTREATS && amountToPay >=499) {
				double discount = 0.20 * amountToPay;
				System.out.println("Promo Code ICICTREATS Applied. You Got Discount worth \u20b9"+discount);
				System.out.println("Please Pay: \u20b9"+(amountToPay-discount));
			}else if(promoCode == KOTAK200) {
				// Nested if/else
				double discount = 0.20 * amountToPay;
				if(discount > 200) {
					discount = 200;
				}
				System.out.println("Promo Code KOTAK200 Applied. You Got Discount worth \u20b9"+discount);
				System.out.println("Please Pay: \u20b9"+(amountToPay-discount));
			} else {
				System.out.println("Invalid Promo Code");
				System.out.println("Please Pay: \u20b9"+(amountToPay));
			}
			
		} else {
			System.out.println("You are NOT elibile for applying any Promo Code");
			System.out.println("Please Pay: \u20b9"+amountToPay);
		}

	}
	
}
