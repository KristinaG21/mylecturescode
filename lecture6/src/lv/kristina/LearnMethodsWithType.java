package lv.kristina;

public class LearnMethodsWithType {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		getArea();
		//System.out.println("Area of rectangle: " +area);

	}

	public static double getArea(){ //getArea stanovitsa objektom
		double num1 = 20.3;
		double num2 = 10.0;
		double result = num1 * num2;
		System.out.println("Area of rectangle: " +result);
        return result;

	}
	
}
