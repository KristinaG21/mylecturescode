import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ROBOT: Hello!!");
        String name = sc.nextLine();
    
        
        String mood  = "";
        while(!mood.equals("exit")){
        System.out.println("ROBOT: How is your day?  Good/Fine/Sad");
        Scanner sc1 = new Scanner(System.in);
        mood = sc1.next();
    
      
      
        if(mood.equalsIgnoreCase("Fine")){
        	System.out.println("ROBOT: Hmmm....I will try to make your day better!!");

        }else if(mood.equalsIgnoreCase("Good")){
        	System.out.println("ROBOT: That's great....!");
        
        }else if(mood.equalsIgnoreCase("Sad")){
        	System.out.println("ROBOT: Ohhhh....!");
        	System.out.println("ROBOT: Hmmm....I will try to make your day better!!");
        	System.out.println("ROBOT: Choose one: Joke, Meme, Recipe or Song.");
        }else{
        	System.out.println("ROBOT: Try one more time... Enter please Good/Fine/Sad ");
        	
      
        }
	}
}
}


        
        
        
   
        
       
	



