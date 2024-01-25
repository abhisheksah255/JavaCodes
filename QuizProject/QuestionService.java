package QuizProject;

import java.util.Scanner;

public class QuestionService {

	Questions[] question=new Questions[5];
	String selection[] =new String[5];
	
	public QuestionService() {
		
		question[0]= new Questions(1,"Which language doesn't support Multiple inheritance ?", "C++", "Java", "JavaScript", "PHP", "Java");
		question[1]= new Questions(2,"Number of primitive data types in Java are?", "6", "7", "8", "9", "8");
		question[2]= new Questions(3,"What is the size of float and double in java?", "32 and 64", "32 and 32", "64 and 64", "64 and 32", "32 and 64");
		question[3]= new Questions(4,"When is the object created with new keyword ?", "At run time", "At compile time", "Depends on the code", "None", "At run time");
		question[4]= new Questions(5,"Identify the keyword among the following that makes a variable belong to a class,rather than being defined for each instance of the class.", "final", "static", "volatile", "abstract", "static");

	
	}

	public void displayQuestions() {
		System.out.println("Questions are being Preparing");
	
	System.out.println(question[0]);
	}
	public void playQuiz() {

		int i=0;
		for(Questions q : question) {
			System.out.println("Question number -: " +q.getId());
			System.out.println(q.getQuestion());
			System.out.println(q.getOpt1());
			System.out.println(q.getOpt2());
			System.out.println(q.getOpt3());
			System.out.println(q.getOpt4());
			System.out.println("................");
			Scanner sc=new Scanner(System.in);
			selection[i]=sc.nextLine();
			i++;

		}
		for(String s: selection) {
			System.out.println("*************");			
			System.out.println(s);
		}
	}
	
	
public void printScore() {
	int score=0;
	for(int i=0;i<question.length;i++) {
		Questions que=question[i];
		String actualAnswer=que.getAnswer();
		String userAnswer=selection[i];
		
		if(actualAnswer.equals(userAnswer)) {
			score++;
		}
	}
	System.out.println("Your Score is : " + score);
}


}
