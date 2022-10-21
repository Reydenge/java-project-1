package hexlet.code.games;
import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Scanner;

public class GameEven {
    public static void identifyEvenNumbers() {
        Scanner in = new Scanner(System.in);
        Cli.greeting();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        int randomNumber = Engine.getRandomNumber();
        Engine.question(randomNumber);
        String rightAnswer = randomNumber%2 == 0 ? "yes" : "no";
        String playerAnswer = in.nextLine();
        Engine.checkAnswerWord(playerAnswer, rightAnswer);
            }
        }
