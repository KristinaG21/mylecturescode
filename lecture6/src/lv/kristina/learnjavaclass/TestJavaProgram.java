package lv.kristina.learnjavaclass;

public class TestJavaProgram {

	
	public static void main(String[] args) {
		Box boxObject = new Box();
		
		
		
		double volume;
		
		
		boxObject.width = 20.23;
		boxObject.height = 3.42;
		boxObject.depth = 15.2;
		
		double result = boxObject.getVolume();
		System.out.println("Volume from method: " +result);
		
//		volume = boxObject.width * boxObject.height * boxObject.depth;
//		
//		 System.out.println("Volume : " +volume);
//		
//		Box boxObject2 = new Box();
//		
//		
		 

	}

}
