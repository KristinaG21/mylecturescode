import java.util.Scanner;


public class ScaneerCalculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		int num1 = 40;
//		int num2 = 50;
//		char add = '+';
//		int result = num1 + num2;
		//
		
	
		System.out.println("Esnter number 1: ");
		int num1 = sc.nextInt();
	
		
		System.out.println("Esnter number 2: ");
		int num2 = sc.nextInt();
	
		sc.nextLine();
		System.out.println("Esnter operator +: ");
		String operatorSymbol = sc.nextLine();
		
		int result = 0;
		if(operatorSymbol.equals("+")){
			result = num1 + num2;
		}else if(operatorSymbol.equals("-")){
			result = num1 - num2;
		}else if(operatorSymbol.equals("/")){
				result = num1 / num2;
		}else if(operatorSymbol.equals("*")){
			result = num1 * num2;
		}else if(operatorSymbol.equals("%")){
			result = num1 % num2;
			}
	
		
		//System.out.println( "test input: " +result);
		System.out.println(result + "=" + num1 +"" +operatorSymbol +num2);
		
		

	}
}



