package hexlet.code.games;
import hexlet.code.Engine;

public class GameEven {
    public static String gameDescription = "Answer 'yes' if the number is even, otherwise answer 'no'.\n";
    private static boolean isEven(int number) {
        return (number % 2 == 0); }
    public static void identifyEvenNumbers() {
        Engine.greeting();
        String[][] gameData = new String[Engine.pointsToWin][2];
        for (int i = 0; i < Engine.pointsToWin; i++) {
            int randomNumber = Engine.getRandomNumber();
            gameData[i][Engine.dataPlayerAnswer] = Integer.toString(randomNumber);
            if (isEven(randomNumber)) {
                gameData[i][Engine.dataRightAnswer] = "yes";
            } else {
                gameData[i][Engine.dataRightAnswer] = "no";
            }
        }
        Engine.checkAnswerWord(gameData, gameDescription);
    }
}
