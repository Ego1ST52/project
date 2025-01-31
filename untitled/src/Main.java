import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.print("Введите количество вопросов: ");
        Scanner scanner = new Scanner(System.in);
        int numberQuestion = Integer.parseInt(scanner.nextLine());
        String[] question = new String[numberQuestion];
        int lenght = numberQuestion;
        for (int i = 1;i <= lenght; i++) {
            System.out.print("Введите вопрос номер: " + i + ": ");
            String questionFromUser = scanner.nextLine();
            System.out.print("Введите через запятую и пробел варианты ответа,после укажите правильный ответ: ");
            String answer = scanner.nextLine();

            System.out.println(questionFromUser);
            System.out.println(answer);



        }

    }
}
