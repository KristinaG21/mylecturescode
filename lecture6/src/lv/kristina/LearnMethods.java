package lv.kristina;

public class LearnMethods {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// void not return type
		// static -nevajag veidot klasses objektu lai izsaukt metodi
		// public, private, protected methods
		
//		getMyName();
//		getMyName();
//		getMyName();
//		getMyName();
//		getMyName();
		System.out.println("________________");
		getMyCity();
		
		
		LearnMethods classObject = new LearnMethods();
		classObject.doYouHaveCat();
	}

	public static void getMyName(){
      System.out.println("My name is Kristina");
	
	}
	
	public static void getMyCity(){
		getMyName();
	      System.out.println("My city is Riga");
	}
	
	public void doYouHaveCat(){
		getMyName();
	      System.out.println("NO");
	}
	}
	
