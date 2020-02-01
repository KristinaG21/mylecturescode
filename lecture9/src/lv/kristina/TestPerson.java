package lv.kristina;

import lv.kristina.users.Teacher;

public class TestPerson {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		String[] strArr = new String[12];
        strArr[0] = "Sport";
        strArr[1] = "Math";
         System.out.println( strArr[0] + "," + strArr[1] );
         
         
         Teacher teacher1 = new Teacher("Toms","Riga");
        System.out.println(teacher1.toString());
        teacher1.addCourse("Sport");
        teacher1.addCourse("Math");
        teacher1.addCourse("Biology");
        teacher1.addCourse("History");
        String[] courses = {"Sport", "Math","Biology", "History"};
        
        
        Teacher t1 = new Teacher("Toms B", "Rigas iela");
        System.out.println(t1.toString());
        String[] coursesForT1 = {"CS10", "AL", "BIO", "CS10" };
        for(String coursess: coursesForT1){
        	if(t1.addCourses(coursess)){
        		System.out.println(coursess + " added ");
        	}else{
        		System.out.println(coursess +  " cannot be added");
        	}
        }
        
        for(String coursess: coursesForT1){
        	if(t1.removeCourses(coursess)){
        		System.out.println(coursess + " removed ");
        	}else{
        		System.out.println(coursess +  " cannot be removed");
        	}
        }
        
        }
	}


 