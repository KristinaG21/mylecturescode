package lv.kristina;

import java.util.ArrayList;

public class TaskTestArrayMethods {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
     
        System.out.println(cars.indexOf("Mazda"));
        System.out.println(cars.isEmpty());
        System.out.println(cars.get(3));
        System.out.println(cars.set(0, "Opel"));//(replace position) zamenaem nulevuju poziciju v massive, a ne dobavlaem
        cars.clear();
        
        System.out.println("++++++++++++++=");
        
        
       System.out.println(cars.size());
       for( String car : cars){
	   System.out.println(car);
  }
       System.out.println();
       cars.remove("Ford");
       cars.remove("Mazde");
       for( String car : cars){
    	   System.out.println(car);
      }
     
       
       

	}

}
