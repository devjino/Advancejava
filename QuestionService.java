import java.util.Scanner;
public class QuestionService {

    Question[] questions = new Question [5];
    String selection[] = new String[5];
    public QuestionService()
    {
        questions[0] = new Questions(1,"size of int","2",);
        questions[1] = new Questions(2,"sze of double","2");
        questions[2] = new Questions(3,"size of char","2",);
        questions[3] = new Questions(4,"size of long","2",);
        questions[4] = new Questions(5,"size of boolean","2",);
    }
    public void playQuiz()
    {
        int i=0;
        for(Questions q : questions){
            System.out.println("Question no. : " + q.getId());
            System.out.println(q.getQuestion);
            System.out.println(q.getopt1());
            System.out.println(q.getopt2());
            System.out.println(q.getopt3());
            System.out.println(q.getopt4());
            Scanner sc = new Scanner(System.in);
            selection = sc.nextLine();
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
        for(int i=0;i<questions.length;i++)
        {
            Question que = questions[i];
            String answer = que.getAnswer();
            String userAnswer = selection[i];

            if(actualAnswer.equals(userAnswe))
            {
                score++;
            }
        }
        System.out.println("Your score is :" + score);
    }
}
