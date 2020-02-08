package lv.kristina.inputoutput;

import java.io.FileReader;

public class TestFileReader {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("Data.txt");
		
		int i;
		while((i=fr.read()) !=-1){
			System.out.print((char)i);
			
		}

	}

}
