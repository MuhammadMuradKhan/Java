import java.util.Scanner;

public class main {

	private String courseName;
	public main(String name) {
		courseName = name;
	}
	public void setcourseName(String name) {
		courseName = name;
	}
	public String getCourseName() {
		return courseName;
	}
	public void displayMessage() {
		System.out.println("Welcome to the grade book for \n"+getCourseName());
	}
	public void determineClassAvg() {
		Scanner input = new Scanner(System.in);
		int total , gradeCounter , grade ;
		double average;
		total = 0;
		gradeCounter = 0;
		System.out.print("Enter grade or -1 to quite :");
		grade = input.nextInt();
		while ( grade != -1 )
		{
		total = total + grade; 
		gradeCounter = gradeCounter + 1; 
		System.out.print( "Enter grade or -1 to quit: " );
		grade = input.nextInt();
			 } 
	 if( gradeCounter != 0)
	 {
		 average = (double) total / gradeCounter;
		 System.out.println( "\nTotal of the grades entered is \n"+ gradeCounter+ total );
		 System.out.println( "Class average is %.2f\n"+ average );
	 }else 
		 System.out.println( "No grades were entered" );
	 }
}