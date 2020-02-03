package lv.kristina;

import java.util.ArrayList;

public class LoopThroughAnArrayList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
       //System.out.println(array);
     

       for( String car : cars){
	  System.out.println(car);
  }
  
	
	}
}


