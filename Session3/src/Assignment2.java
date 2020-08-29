import java.util.Scanner;

// Assignment: Integrate PromoCoode Coupon Snippet in this program w.r.t. OLA Ride Booking Program :)

public class Assignment2 {

	public static void main(String[] args) {
		
		// MODEL
		int baseFare = 50;
		int kmCharge = 10;
		
		int distanceTravlled = 100;
		
//		int olaMicro = 1;
//		int olaMini = 2;
//		int olaSedan = 3;
//		int olaBike = 4;
//		int olaShared = 5;

		int amountToPay = 0;
		
		
		// VIEW
		System.out.println("=========================");
		System.out.println("Select the Type of Cab:");
		System.out.println("1. OLA MICRO");
		System.out.println("2. OLA MINI");
		System.out.println("3. OLA SEDAN");
		System.out.println("4. OLA BIKE");
		System.out.println("5. OLA SHARED");
		System.out.println("=========================");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Your Choice:");
		int choice = scanner.nextInt();
		
		switch(choice) {
		
			case 1:
				baseFare += 10;
				amountToPay = baseFare + (kmCharge*distanceTravlled);
				break;
				
			case 2:
				baseFare += 20;
				amountToPay = baseFare + (kmCharge*distanceTravlled);
				break;
			
			case 3:
				baseFare += 50;
				amountToPay = baseFare + (kmCharge*distanceTravlled);
				break;
				
			case 4:
				baseFare += 5;
				amountToPay = baseFare + (kmCharge*distanceTravlled);
				break;
				
			case 5:
				baseFare += 8;
				amountToPay = baseFare + (kmCharge*distanceTravlled);
				break;
				
			default:
				System.out.println("Please Select Cab to Porceed");
				break;
				
		}
		
		// PROMO CODE
		int KOTAK200 = 1;
		int ICICTREATS = 2;
		
		if(amountToPay >= 399) {
			System.out.println("Total amount is: " + amountToPay);
			System.out.println("You are elibile for applying Promo Code");
			System.out.println("1. KOTAK200 for orders above Rs.399. 20% Off Upto 200");
			System.out.println("2. ICICTREATS for orders above Rs.499. Flat 20%");
			
			int promoCode = scanner.nextInt(); // either 1 or 2
			scanner.close();
			
			if(promoCode == ICICTREATS && amountToPay < 500) {
				System.out.println("This promo code is only valid for orders above 499");
				System.out.println("You can apply KOTAK200");
			} else if(amountToPay <= 499) {
				System.out.println("To get a discount, apply KOTAK200 promo code");
			} else if(amountToPay > 499 && promoCode == KOTAK200) {
				System.out.println("ICICTREATS will give you more discount for this amount");
			} else if(promoCode == ICICTREATS && amountToPay >=499) {
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
			System.out.println("Please Pay: \u20b9"+amountToPay);
		}

		
	}


	
}
