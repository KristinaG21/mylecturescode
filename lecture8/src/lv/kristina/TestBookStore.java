package lv.kristina;



import lv.kristina.bookstore.Author;
import lv.kristina.bookstore.Book;

public class TestBookStore {


	public static void main(String[] args) {
		
		Author rowling = new Author("J.K.Rowling", "rowling@gmail.com", 'f');
		Author rainis = new Author("Rainis", "rainis@gmail.com", 'm');
		System.out.println(rowling.getEmail());
	     rowling.setEmail("rowling22@gmail.com");
	     System.out.println(rowling.getEmail());
		
		
		System.out.println("++++++++++++++++++++++++");
		
		
		Book harrypotter = new Book("Harry Potter",rowling, 20.5, 1000);
		System.out.println(harrypotter.toString());
		
		Author test20 = new Author("Test20");
		Book test21 = new Book("Test Book", test20, 40.2, 40);
		System.out.println(test21.toString());
		
		Author test1 = new Author ("name", "name@name", 'f');
		Author test2 = new Author ("name1", "name@name1", 'o');
		
		System.out.println(test1.toString());
		System.out.println(test2.toString());
		
		System.out.println("++++++++++++++++++++++++");
		
		
		
		char m = 'm';
		char f = 'f';
		char gender = 'j';
		
		
		if(gender == m || gender == f){
			System.out.println("It is M of F");
		}else{
			System.out.println("It is not M of F");
			
			
		}
	}

}
