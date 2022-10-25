package hexlet.code.games;

import hexlet.code.Engine;

public class GameArithProg {
    public static String gameDescription = "What number is missing in the progression?\n";
    public static int maxLengthOfProgression = 10;
    public static int firstElementOfProgression = 10;
    public static int maxStepOfProgression = 10;
    public static int maxNumberOfMissingElement = 9;

    public static int[] getArithmeticProgression(int firstElement, int stepOfProgression, int lengthOfProgression) {
        int[] arithmeticProgression = new int[lengthOfProgression];
        for (int i = 0; i < lengthOfProgression; i++) {
            if (i == 0) {
                arithmeticProgression[i] = firstElement;
            } else {
                arithmeticProgression[i] = arithmeticProgression[i - 1] + stepOfProgression;
            }
        }
        return arithmeticProgression;
    }

    public static void createArithmeticProgression() {
        int firstElement;
        int stepOfProgression;
        String[][] dataGame = new String[Engine.pointsToWin][2];
        Engine.greeting();

        for (int j = 0; j < Engine.pointsToWin; j++) {
            firstElement = Engine.getLimitedRandomNumber(firstElementOfProgression);
            stepOfProgression = Engine.getLimitedRandomNumber(maxStepOfProgression) + 1;
            int[] arithmeticProgression = getArithmeticProgression(firstElement, stepOfProgression, maxLengthOfProgression);
            int numberOfMissingElement = Engine.getLimitedRandomNumber(maxNumberOfMissingElement);
            String tempElement = "";
            for (int p = 0; p < maxLengthOfProgression; p++) {
                if (p == numberOfMissingElement) {
                    tempElement = tempElement.concat(".. ");
                } else {
                    tempElement = tempElement.concat(Integer.toString(arithmeticProgression[p]));
                    tempElement = tempElement.concat(" ");
                }
            }
            dataGame[j][Engine.dataPlayerAnswer] = tempElement;
            dataGame[j][Engine.dataRightAnswer] = Integer.toString(arithmeticProgression[numberOfMissingElement]);
        }
        Engine.checkAnswerWord(dataGame, gameDescription);
    }
}
