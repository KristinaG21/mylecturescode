
public class ArraysSumForLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] marks = {76, 23, 42};
		// Sum all values in arrays
		// Print in console
		
//		int result = 10;
//		System.out.println("result value: "+result);
//		int testInt = 90;
//		result = testInt;
//		
//		System.out.println("result value: "+result);
		
		int sum = 0;
		
		for(int i = 0; i < marks.length; i++){
			sum += marks[i];
			
		}
		System.out.println("Sum of marks: "+sum);
		
		
		System.out.println(marks[0]+marks[1]+marks[2]);
		
		int sumTest = 0;
	     sumTest = sumTest + 200; //200
	     sumTest = sumTest + 220; //200 + 220 = 420
	     sumTest = sumTest + 240; // 420 + 240 = 660
	     
	     
	     // -= and look how this operator works
	     int subOperator = 660;
	     subOperator -= 200; //400
	     subOperator -= 220; //400-220=180
	     subOperator -= 240; //580-
	     
	     
	     System.out.println("Testing += opetator: "+sumTest);
	     System.out.println("Testing -= opetator: "+subOperator);
		
		

	}

}