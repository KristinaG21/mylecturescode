package lv.kristina.inputoutput;

import java.io.File;
import java.util.Scanner;

public class TestScannerFileRead {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws Exception {
		File file = new File("Data.txt");
		
		Scanner sc = new Scanner(file);
		while(sc.hasNextLine()){
			System.out.println(sc.nextLine());
			
		}

	}

}
