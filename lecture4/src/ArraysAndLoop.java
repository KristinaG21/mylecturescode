
public class ArraysAndLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Declare variable
		
		int[] marks = {76, 23, 42, 100, 99, 10, 56};
		//Make toString all elements of Array
		//Print in console
		
		for(int i = 0; i < marks.length; i++){
			System.out.println(marks[i]);
			
		}

		for(int i = 0; i < marks.length; i++){
			System.out.print(marks[i]);
			
		}
		System.out.println("+++++++++++++++++++++++++");
		
		
		System.out.print("[");
		
		for(int i = 0; i < marks.length -1; i++){
			System.out.print(marks[i] + ",");	
			
		}
		
		//System.out.println(marks[marks.length-1] +"]");
		System.out.println(marks[6] +"]");
		// System.out.println - v liniju
		
		
		System.out.println("\n"+marks.length);
	}

}
