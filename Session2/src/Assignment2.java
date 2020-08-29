// Assignment: Explore shift operators on negative numbers

public class Assignment2 {

	public static void main(String[] args) {
		
		int num = -16;
		
		System.out.println(num << 1); // 0001 0000 -> left shift by 1 -> 0010 0000 with negative sign 
		System.out.println(num >> 1); // 0001 0000 -> right shift by 1 -> 0000 1000 with negative sign

	}

}
