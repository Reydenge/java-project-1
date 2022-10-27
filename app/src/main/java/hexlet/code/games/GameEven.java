package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.RandomUtils;

public class GameEven {
    private static String gameDescription = "Answer 'yes' if the number is even, otherwise answer 'no'.\n";
    private static boolean isEven(int number) {
        return (number % 2 == 0);
    }

    public static void identifyEvenNumbers() {
        String[][] gameData = new String[Engine.POINTS_TO_WIN][2];
        for (int i = 0; i < Engine.POINTS_TO_WIN; i++) {
            int randomNumber = RandomUtils.getLimitedRandomNumber(RandomUtils.MAX_NUMBER);
            gameData[i][Engine.DATA_QUESTION] = Integer.toString(randomNumber);
            gameData[i][Engine.DATA_ANSWER] = isEven(randomNumber) ? "yes" : "no";
        }
        Engine.launchAnswerChecking(gameData, gameDescription);
    }
}
