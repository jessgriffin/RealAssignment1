import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//YOU NEED TO NOT MAKE EVERYTHING PERCENTS. THEORY MARKS ALL OUT OF 65 , PRACTICAL ALL OUT OF 30. CALCULATE FINAL PERCENT AFTER


public class FinalMarkCalculator {

	static String userInput; 
	
	 //variables to hold each individual mark
	static double labActivitiesMark;
	static double assignmentsMark;
	static double hybridAssignmentsMark;
	static double quizMark;
	static double practicalAssessmentMark;
	static double finalExamMark;
	
	 //variables for final marks
	static double practicalGrade;
	static double theoryGrade;
	static double calculatedFinalGrade;
	
	public static void main(String[] args) throws IOException {
		
		InputStreamReader r = new InputStreamReader(System.in);
	    BufferedReader br = new BufferedReader(r);
	    System.out.println("Welcome to Jess. G's mark calculator.");
	    
	    //accepts lab activities mark input, and converts it into a percent value
	    System.out.print("Please enter your Lab Activities mark out of 10:");
	    labActivitiesMark = Double.parseDouble(br.readLine());
	    labActivitiesMark = (labActivitiesMark / 10 )* 100;
	    
	    //accepts assignment mark input, and converts it into a percent value
	    System.out.print("Please enter your Assignments mark out of 20:");
	    assignmentsMark = Double.parseDouble(br.readLine());
	    assignmentsMark = (assignmentsMark / 20)* 100; 
	 
	    //accepts hybrid assignment mark input, converts to percent
	    System.out.print("Please enter your Hybrid Assignment mark out of 5:");
	    hybridAssignmentsMark = Double.parseDouble(br.readLine());
	    hybridAssignmentsMark = (hybridAssignmentsMark / 5) * 100;
	      
	    //accepts quiz/test mark input, converts to percent
	    System.out.print("Please enter your Quiz(zes) / Test(s) mark out of 25:"); 
	    quizMark = Double.parseDouble(br.readLine());
	    quizMark = (quizMark / 25) * 100; 
	    
	    //accepts practical assessment mark and converts to percent
	    System.out.print("Please enter your Practical Assessment mark out of 10:");
	    practicalAssessmentMark = Double.parseDouble(br.readLine());
	    practicalAssessmentMark = (practicalAssessmentMark / 10) * 100;
	    
	    //accepts final exam mark and converts it into a percent
	    System.out.print("Please enter your final exam mark out of 30:");
	    finalExamMark = Double.parseDouble((br.readLine()));
	    finalExamMark = (finalExamMark / 30) * 100; 
	    
	    //calculating practical mark
	    practicalGrade = (practicalAssessmentMark + assignmentsMark + labActivitiesMark) / 3; 
	    System.out.print("Your practical grade is:" + practicalGrade);
	    
	    
	    //calculating theory mark
	    theoryGrade = (finalExamMark + )
	    
	    //calculating final mark
	    
	}
}
