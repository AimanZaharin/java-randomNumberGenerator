import java.util.Scanner;

public class randomNumberGenerator {

	public static void main(String[] args) {

		System.out.println("This is a random number generator");
		
		System.out.print("Please enter the max range you want to generate (integer): ");
		Scanner input = new Scanner(System.in);
		int maxrange = input.nextInt();
		

		int number1 = (int)(Math.random() * maxrange); 
		
		System.out.print("The random number you have generated is: " + number1);
	}

}


 