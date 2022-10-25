package hexlet.code.games;

import hexlet.code.Engine;

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
        String[][] gameData = new String[Engine.pointsToWin][2];
        Engine.greeting();
        for (int i = 0; i < Engine.pointsToWin; i++) {
            firstNumber = Engine.getRandomNumber();
            secondNumber = Engine.getRandomNumber();
            gameData[i][Engine.dataRightAnswer] = Integer.toString(gcdOfTwoNumbers(firstNumber, secondNumber));
            gameData[i][Engine.dataPlayerAnswer] = firstNumber + " " + secondNumber;
        }
        Engine.checkAnswerWord(gameData, gameDescription);
    }
}
