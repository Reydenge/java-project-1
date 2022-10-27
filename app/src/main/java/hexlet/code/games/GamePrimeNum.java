package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomUtils;

import java.math.BigInteger;

public class GamePrimeNum {
    public static String gameDescription = "Answer 'yes' if given number is prime. Otherwise answer 'no'.\n";

    public static boolean isPrime(int number) {
        BigInteger bigInteger = BigInteger.valueOf(number);
        return bigInteger.isProbablePrime((int) Math.log(number));
    }

    public static void identifyPrimeNumber() {
        int randomNumber;
        String[][] dataGame = new String[Engine.POINTS_TO_WIN][2];
        for (int i = 0; i < Engine.POINTS_TO_WIN; i++) {
            randomNumber = RandomUtils.getRandomNumber();
            dataGame[i][Engine.DATA_QUESTION] = Integer.toString(randomNumber);
            dataGame[i][Engine.DATA_RIGHT_ANSWER] = isPrime(randomNumber) ? "yes" : "no";
        }
        Engine.launchAnswerChecking(dataGame, gameDescription);
    }
}
