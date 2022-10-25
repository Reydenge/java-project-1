package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static int pointsToWin = 3;
    public static int dataPlayerAnswer = 0;
    public static int dataRightAnswer = 1;
    public static String playerName;

    public static int getRandomNumber() {
        return (int) (Math.random() * (200 - 10 + 1) + 10);
    }

    public static int getLimitedRandomNumber(int limit) {
        return (int) (Math.random() * limit);
    }

    public static String playerAnswerString() {
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    public static void greeting() {
        Scanner in = new Scanner(System.in);
        System.out.print("Welcome to the Brain Games! \nMay I have your name? ");
        playerName = in.nextLine();
        System.out.println("Hello, " + playerName + "!");
    }
    public static String getPlayerName() {
        return playerName;
    }
    public static void congratulation(String name) {
        System.out.println("Congratulation, " + name + "!");
    }
    public static void checkAnswerWord(String[][] dataGame, String gameDescription) {
        int count = 0;
        String playerAnswer;
        System.out.println(gameDescription);
        while (count < Engine.pointsToWin) {
            System.out.println("Question: " + dataGame[count][dataPlayerAnswer]);
            System.out.print("Your answer: ");
            playerAnswer = playerAnswerString();
            if (playerAnswer.equals(dataGame[count][dataRightAnswer])) {
                System.out.println("Correct!");
                count++;
            } else {
                System.out.println("'" + playerAnswer + "'" + " is wrong answer ;(. Correct answer was " + "'" + dataGame[count][dataRightAnswer] + "'. " + "\nLet's try again, " + getPlayerName() + "!");
                return;
            }
        }
        Engine.congratulation(getPlayerName());
    }
}
