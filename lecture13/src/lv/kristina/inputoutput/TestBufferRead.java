package lv.kristina.inputoutput;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class TestBufferRead {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		File file = new File("Data.txt");
		FileReader fileReader = new FileReader(file);
		
		BufferedReader buffReader = new BufferedReader(fileReader);
		
		String stingFileData;
		
		while((stingFileData = buffReader.readLine()) !=null){
			System.out.println(stingFileData);
		}
		
		

	}

}
