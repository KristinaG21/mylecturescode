package lv.kristina;

public class LearnMethodsWithParams {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
      // cast 

	    double radius = 30.2;	
	    String color = "red";
	    
		
		int resultWithCastInt = getArea(radius);// this method cast double to int
		double result = getAreaForCircle(radius);
		System.out.println("Ares: " +resultWithCastInt);
		System.out.println("Ares: " +result);
		
		System.out.println(getColorAndArea(color, result));
		
	}

	
	public static int getArea(double radius){
	
	  double result = Math.PI * (radius * radius);
      return (int) result;
	  
	}
	
	public static double getAreaForCircle(double radius){
		
		 double result = Math.PI * (radius * radius);
		 return result; 

	}
	
	public static String getColorAndArea(String color, double area){
		return "Color:" +color + " and area" + area;
		
	}
	
	
	}
	
