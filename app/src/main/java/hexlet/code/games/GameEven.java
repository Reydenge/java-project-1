package hexlet.code.games;
import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Scanner;

public class game_even {
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
                Engine.correct();
                counter++;
            } else if (randomNumber % 2 != 0 && playerAnswer.equals("no")) {
                Engine.correct();
                counter++;
            } else if (randomNumber % 2 == 0 && playerAnswer.equals("no")) {
                Engine.uncorrectNo();
                break;
            } else if (randomNumber % 2 != 0 && playerAnswer.equals("yes")) {
                Engine.uncorrectYes();
                break;
            } else {
                Engine.uncorrectInput();
                break;
            }
            if (counter == 3) {
                Engine.congratulation(Cli.getPlayerName());
            }
        }
    }
}
