package Lab2a;

/*	Comp3111LEx\Lab2a\mainApp2a.java
	main Application for Lab2 Exercise 1	*/

public class mainApp2a {
    public static void main(String[] args) {
        Score k = new Score();
        k.setQuiz(90);
        k.setMidTExam(70);
        k.setFinalExam(85);
        System.out.println("Testing...");
        System.out.println("Quiz        : "+k.Quiz);
        System.out.println("Midterm Exam: "+k.MidTExam);
        System.out.println("Final Exam  : "+k.FinalExam);
        System.out.println("Total Score : "+k.getScore());
        System.out.println("Letter Grade: "+k.getGrade());
        System.out.println("Comment     : "+k.getComment());
    }
}
