package lv.kristina.learnstring;

public class TestStringClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str= " In de x  ";
		String strClass = new String(str);
		
		
		
		System.out.println(str);

		System.out.println("String like object:" +strClass);
		
		
		int stringLenght = str.length();
		System.out.println(stringLenght);// kolichestvo simbolov
		
		System.out.println(str.charAt(4));
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		System.out.println(str.trim());
		System.out.println(str.replace(" ", ""));
		
		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = "NotHello";
		
		System.out.println(s1 == s2);
		System.out.println(s1 == s1);
		System.out.println(s1 == s3);
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(!s1.equals(s2));
		System.out.println(!s2.equals(s3));
	
	
	
	
	}
	
	

}
