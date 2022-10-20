package hexlet.code;
import java.util.Scanner;

public class GamesLogic {
    public static void evenNumbers() {
        int randomNumber = 0;
        int counter = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Welcome to the Brain Games! \nMay I have your name? ");
        String playerName = in.nextLine();
        System.out.println("Hello, " + playerName + "! \nAnswer 'yes' if the number is even, otherwise answer 'no'.");

        while (counter < 3) {
            randomNumber = (int) (Math.random() * (200 - 10 + 1) + 10);
            System.out.println("Question: " + randomNumber);
            String playerAnswer = in.nextLine();

            if (randomNumber % 2 == 0 && playerAnswer.equals("yes")) {
                System.out.println("Correct!");
                counter++;
            } else if (randomNumber % 2 != 0 && playerAnswer.equals("no")) {
                System.out.println("Correct!");
                counter++;
            } else if (randomNumber % 2 == 0 && playerAnswer.equals("no")) {
                System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.\nLet's try again");
            } else if (randomNumber % 2 != 0 && playerAnswer.equals("yes")) {
                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.\nLet's try again");
            } else if (!playerAnswer.equals("yes") || !playerAnswer.equals("no")) {
                System.out.println("Your answer is wrong ;(.\nLet's try again");
            }
            if (counter == 3) {
                System.out.println("Congratulation, " + playerName + "!");
            }
        }
    }
}
