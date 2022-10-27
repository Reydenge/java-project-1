package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomUtils;

public class GameGCD {
    public static String gameDescription = "Find the greatest common divisor of given numbers.\n";

    private static int gcdOfTwoNumbers(int firstNumber, int secondNumber) {
        if (secondNumber == 0) {
            return firstNumber;
        }
        return gcdOfTwoNumbers(secondNumber, firstNumber % secondNumber);
    }

    public static void calculateGCD() {
        int firstNumber;
        int secondNumber;
        String[][] gameData = new String[Engine.POINTS_TO_WIN][2];
        for (int i = 0; i < Engine.POINTS_TO_WIN; i++) {
            firstNumber = RandomUtils.getRandomNumber();
            secondNumber = RandomUtils.getRandomNumber();
            gameData[i][Engine.DATA_QUESTION] = firstNumber + " " + secondNumber;
            gameData[i][Engine.DATA_RIGHT_ANSWER] = Integer.toString(gcdOfTwoNumbers(firstNumber, secondNumber));
        }
        Engine.launchAnswerChecking(gameData, gameDescription);
    }
}
