package hexlet.code.games;

import hexlet.code.Engine;

import java.math.BigInteger;

public class GamePrimeNum {
    public static String gameDescription = "Answer 'yes' if given number is prime. Otherwise answer 'no'.\n";

    public static boolean isPrime(int number) {
        BigInteger bigInteger = BigInteger.valueOf(number);
        return bigInteger.isProbablePrime((int) Math.log(number));
    }

    public static void identifyPrimeNumber() {
        int randomNumber;
        String[][] dataGame = new String[Engine.pointsToWin][2];
        Engine.greeting();
        for (int i = 0; i < Engine.pointsToWin; i++) {
            randomNumber = Engine.getRandomNumber();
            dataGame[i][Engine.dataPlayerAnswer] = Integer.toString(randomNumber);
            if (isPrime(randomNumber)) {
                dataGame[i][Engine.dataRightAnswer] = "yes";
            } else {
                dataGame[i][Engine.dataRightAnswer] = "no";
            }
        }
        Engine.checkAnswerWord(dataGame, gameDescription);
    }
}
