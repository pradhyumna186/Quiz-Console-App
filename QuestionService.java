import java.util.Scanner;

public class QuestionService {

    Question [] questions = new Question[5];
    String selection[] = new String[5];
    public QuestionService()
    {
        questions[0] = new Question(1, "Which language is used for Android app development?", "JAVA", "CPP", "PYTHON", "C#", "JAVA");
        questions[1] = new Question(2, "Which of the following is not an OOP concept?", "Encapsulation", "Polymorphism", "Compilation", "Inheritance", "Compilation");
        questions[2] = new Question(3, "Which data structure uses FIFO principle?", "Stack", "Queue", "Tree", "Graph", "Queue");
        questions[3] = new Question(4, "Which keyword is used to inherit a class in Java?", "this", "super", "extends", "implements", "extends");
        questions[4] = new Question(5, "Which of these is a valid way to start a main method in Java?", "public void main()", "public static void main(String[] args)", "static public main()", "void static main()", "public static void main(String[] args)");
    }
 

    public void playQuiz()
    {   
        int i =0;
        for(Question q : questions)
        {
        System.out.println("Question no. : "+q.getId());
        System.out.println(q.getQuestion());
        System.out.println(q.getOpt1());
        System.out.println(q.getOpt2());
        System.out.println(q.getOpt3());
        System.out.println(q.getOpt4());
        Scanner sc = new Scanner(System.in);
        selection[i] = sc.nextLine();
        i++;

        }
        for(String s : selection)
        {
            System.out.println(s);
        }
    }

    public void printScore()
    {
        int score = 0;
        for(int i = 0;i<questions.length;i++)
        {
            Question que = questions[i];
            String actualAnswer = que.getAnswer();

            String userAnswer = selection[i];
            if (actualAnswer.equals(userAnswer)){
                score++;
            }
        }
        System.out.println("Your score is : "+score);
    }


}
