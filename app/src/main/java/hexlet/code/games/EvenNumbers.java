package hexlet.code.games;
import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Scanner;

public class EvenNumbers {
    public static void identifyEvenNumbers() {
        int counter = 0;
        Scanner in = new Scanner(System.in);
        Cli.greeting();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        while (counter < 3) {
            int randomNumber = Engine.getRandomNumber();
            Engine.question(randomNumber);
            String playerAnswer = in.nextLine();

            if (randomNumber % 2 == 0 && playerAnswer.equals("yes")) {
                System.out.println("Correct!");
                counter++;
            } else if (randomNumber % 2 != 0 && playerAnswer.equals("no")) {
                System.out.println("Correct!");
                counter++;
            } else if (randomNumber % 2 == 0 && playerAnswer.equals("no")) {
                System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.\nLet's try again");
                break;
            } else if (randomNumber % 2 != 0 && playerAnswer.equals("yes")) {
                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.\nLet's try again");
                break;
            } else if (!playerAnswer.equals("yes") || !playerAnswer.equals("no")) {
                System.out.println("Your answer is wrong ;(.\nLet's try again");
                break;
            }
            if (counter == 3) {
                Engine.congratulation(Cli.getPlayerName());
            }
        }
    }
}
