package lv.kristina.inputoutput;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class TestChangeStringToFile {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws Exception {
		
//		String defaultStr = new String ("Hello user userName");
//	    System.out.println(defaultStr.replaceFirst("userName", "Kristina")); 

		
       File file = new File("DefaultText.txt");
		
		Scanner sc = new Scanner(file);
		String stringFromTextFile = "";
		while(sc.hasNextLine()){
			stringFromTextFile = sc.nextLine();
		}
	
         String lastString = stringFromTextFile.replaceFirst("userName", ""); 
         String userName = "Kristina Gejenko";
         File fileForUser = new File(userName + ".txt");
		 FileWriter fw = new FileWriter(fileForUser,true);
		
		 fw.write(lastString+userName);
		
		 fw.close();

	}
}

			
	


