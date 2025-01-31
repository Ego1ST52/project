import java.util.ArrayList;

public class Question {
    private int number;
    private int trueAnswerIndex;
    private String question;
    private ArrayList<String> answer;

    public Question(int trueAnswerIndex, String question, ArrayList<String> answer) {
        this.trueAnswerIndex = trueAnswerIndex;
        this.question = question;
        this.answer = answer;
    }


}
