package lv.kristina;

import java.util.Arrays;
import java.util.Scanner;

public class TestScannerInputArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
	     
	      String [] myArray = new String[3];
	   
	      System.out.println("Enter 3 names:");

	      for(int i=0; i<3; i++ ) {
	         myArray[i] = sc.nextLine();
	      }

	      System.out.println(Arrays.toString(myArray));
	   
	
	   System.out.println("Do you wanna print array?");
	   System.out.println("Type (Print)");
	   System.out.println("Type (notPrint)");
	   String statusCheck = sc.nextLine();
	
	   
	   if(statusCheck.equals("Print")){
		   printArray(myArray);
	   }else if(statusCheck.equals("notPrint")){
		   System.out.println("Exit");
	   }else{
		   System.out.println("You enter it wrong");
	   }
	   
	   }

	private static void printArray(String[] myArray) {
		for(int i=0; i<3; i++ ) {
			System.out.println(myArray[i] + "this user is added to array");
		}
	}
	
	}