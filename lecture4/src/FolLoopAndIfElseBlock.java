
public class FolLoopAndIfElseBlock {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		int[] number = {1, 3, 4, 2};
		
		//Find in array number ?? and print his name in console
		
		int checkNumber = 2;
//		if (number[0] == checkNumber){
//			System.out.println("ONE");
//		}else{
//			System.out.println("Not exist this number");
//		}
	    for( int i = 0; i < number.length; i++){
	    	//System.out.println(number[i]);
	    	
	    	if(number[i] == checkNumber){
	    		System.out.println(number[i]);
	    		break;
	    	}else{
	    		System.out.println("Note number in array");
	    	}
	    }
	
	}
	
	
	

}
