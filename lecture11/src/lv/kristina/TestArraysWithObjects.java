package lv.kristina;

import java.util.ArrayList;
import java.util.Collections;

public class TestArraysWithObjects {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Integer intObj = 40;
		Double doubleOnj = 40.24;
		
		System.out.println(intObj);
		
		ArrayList<Integer> intArrays = new ArrayList<>();// Integer is class ,not int primitive

		intArrays.add(40);
		intArrays.add(23);
		intArrays.add(60);
		intArrays.add(93);
		System.out.println(intArrays);
		
		Collections.sort(intArrays);
		System.out.println(intArrays);
	}

}
