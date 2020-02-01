package lv.kristina.users;

public class Student extends Person {

	private int numCourses;
	private String[] courses;
	private int[] grades;
	private static final int MAX_COURSE = 12;
	
	public Student(String name, String address){
		super(name, address);
	    this.numCourses = 0;
	    this.courses = new String[MAX_COURSE];
	    this.grades = new int[MAX_COURSE];
	
	
	}
	
	public void addCourseGrade(String course, int grade){
		courses[numCourses] = course;
		grades[numCourses] = grade;	
		++numCourses;
	}
	
	
	public void printGrades(){
		System.out.println();
		for(int i = 0; i < numCourses; i++){
		System.out.println(" " + courses[i] + ":" + grades[i]);
		
	}
	
	System.out.println();
}
	
	public double getAverageGrade(){
		int sum = 0;
		for(int i=0; i < numCourses; i++){
			sum = sum + grades[i];
	}
		return (double)sum/numCourses;
	}
		
	
	public String toString(){
		return "Student: " +super.toString();
	}
}
