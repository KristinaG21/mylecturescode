
public class Arraysprimitive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] arrays; //declare arrays with type int
		//int arrays2[]; //the same as first
		arrays = new int[2];
		
		int[] arr = new int[10];
		
		int[] arrTest = new int[5];// kolichestvo elementov v massive, skolko korobok
		
		arrTest[0] = 10;
		arrTest[1] = 3;
		arrTest[4] = 4;

		
		System.out.println(arrTest[0] + " " + arrTest[1] + " " + arrTest[4]);
		
           System.out.println("***********8");
           
           
		double[] doubleArray = new double[3];
		
		doubleArray[0] = 0.5;
		doubleArray[1] = 1;
		doubleArray[2] = 0.2;
		
		System.out.println(doubleArray[0]
				+ " " + doubleArray[1]
				+ " " + doubleArray[2]);
		
		System.out.println("***********8");
		
		char[] charArray = new char[2];
		
		charArray[0] = 'D';
		charArray[1] = 'f';
		
		System.out.println(charArray[0]	+ " " + charArray[1]);
		
		System.out.println("***********8");
		
		boolean[] booleanArray = new boolean[2];
		
		booleanArray[0] = true;
		booleanArray[1] = false;
		System.out.println(booleanArray[0]	+ " " + booleanArray[1]);
		
		
		System.out.println("***********8");
		int checkLenght = arrTest.length;
		int checkLenght2 = booleanArray.length;
		System.out.println("Array lenght is " + checkLenght);
		System.out.println("Array lenght is " + checkLenght2);
		
	
		System.out.println("***********8");
		System.out.println(booleanArray[booleanArray.length-1]);
		
	}

}
