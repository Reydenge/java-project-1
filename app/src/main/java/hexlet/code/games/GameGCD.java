package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomUtils;

public class GameGCD {
    private static String gameDescription = "Find the greatest common divisor of given numbers.\n";

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
            firstNumber = RandomUtils.getLimitedRandomNumber(RandomUtils.MAX_NUMBER);
            secondNumber = RandomUtils.getLimitedRandomNumber(RandomUtils.MAX_NUMBER);
            gameData[i][Engine.DATA_QUESTION] = firstNumber + " " + secondNumber;
            gameData[i][Engine.DATA_ANSWER] = Integer.toString(gcdOfTwoNumbers(firstNumber, secondNumber));
        }
        Engine.launch(gameData, gameDescription);
    }
}
