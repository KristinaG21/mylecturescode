package lv.kristina;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String inputStr = "ab48bc03uhkmf79jgfb030_0";
		String regexStrExp = "[a-z]+";
		
		System.out.println(inputStr.charAt(0));
		System.out.println(inputStr.charAt(1));

		
		Pattern pattern = Pattern.compile(regexStrExp);
		Matcher matcher = pattern.matcher(inputStr);
		
		while(matcher.find()){
			System.out.println("find() found substring " +matcher.group());
		}
		
		String replaceSymbols = "lv";
		String outputStr = matcher.replaceFirst(replaceSymbols);
		System.out.println(outputStr);
	}
	
	

}
