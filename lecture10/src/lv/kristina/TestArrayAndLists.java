package lv.kristina;

public class TestArrayAndLists {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] arr = new String[10];
		String[] arrWith = {"1", "1", "1", "1", "1", "1", "1", "1", "1", "1"};
        arrToString(arr);
        System.out.println();
		arrToString(arrWith);
		System.out.println();
		addElementsToArr(arr);
		
		}
		 public static void arrToString(String[] arr){
			 for(int i =0; i<arr.length; i++){
					System.out.println("index number are " +i+ " " + arr[i]);
		 }

	}
        public static void addElementsToArr(String[] arr){
        	for(int i =0; i<arr.length; i++){
        		arr[i] = arr[i] + i;
        	}
        	arrToString(arr);
        }
		 
		 
}
