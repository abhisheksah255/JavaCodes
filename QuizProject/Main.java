package QuizProject;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		QuestionService service = new QuestionService();
		
		service.playQuiz();
		service.printScore();
	}

}
