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
	    
	    //accepts lab activities mark input (
	    System.out.print("Please enter your Lab Activities mark out of 10:");
	    labActivitiesMark = Double.parseDouble(br.readLine());
	    
	    //accepts assignment mark input
	    System.out.print("Please enter your Assignments mark out of 20:");
	    assignmentsMark = Double.parseDouble(br.readLine());
	 
	    //accepts hybrid assignment mark input
	    System.out.print("Please enter your Hybrid Assignment mark out of 5:");
	    hybridAssignmentsMark = Double.parseDouble(br.readLine());
	      
	    //accepts quiz/test mark input
	    System.out.print("Please enter your Quiz(zes) / Test(s) mark out of 25:"); 
	    quizMark = Double.parseDouble(br.readLine());
	    
	    //accepts practical assessment mark
	    System.out.print("Please enter your Practical Assessment mark out of 10:");
	    practicalAssessmentMark = Double.parseDouble(br.readLine());
	    
	    //accepts final exam mark 
	    System.out.print("Please enter your final exam mark out of 30:");
	    finalExamMark = Double.parseDouble((br.readLine()));
	    
	    //calculating practical mark. Add the number of points for each section together, find the percents by dividing number of points by number of points possible and multiply by 100 (repeat for each mark calculation section)
	    practicalGrade = practicalAssessmentMark + assignmentsMark + labActivitiesMark;
	    practicalGrade = (practicalGrade / 40) * 100;
	    
	    System.out.println("Your practical grade is:" + practicalGrade + "%");
	    
	    
	    //calculating theory mark THIS IS WRONG STILL
	    theoryGrade = quizMark + finalExamMark + hybridAssignmentsMark;
	    theoryGrade = (theoryGrade/ 60) * 100;
	    //THEORY GRADE IS STILL WRONG YOU NEED TO FIX THIS I THINK YOURE CALCULATING IT WRONG
	    System.out.println("Your theory grade is:" + theoryGrade + "%");
	    
	    //calculating final mark
	    //Since everything is already out of 100, it's already kind of in a percent so we just need to add the total number of points together
	    calculatedFinalGrade = labActivitiesMark + assignmentsMark + hybridAssignmentsMark + quizMark + practicalAssessmentMark + finalExamMark;
	    System.out.println("Your calculated final grade is: " + calculatedFinalGrade + "%");
	    
	    
	}
}
