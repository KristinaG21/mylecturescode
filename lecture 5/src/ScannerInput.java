import java.util.Scanner;


public class ScannerInput {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		
		System.out.println("Esnter number: ");
		int number = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter name:");
		String name = sc.nextLine();
		
		
		System.out.println("Your number is " + number);
		System.out.println("Your name is " + name);

	}

}

