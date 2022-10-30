package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomUtils;

public class GameArithProg {
    private static String gameDescription = "What number is missing in the progression?\n";
    public static final int MAX_LENGTH = 10;
    public static final int FIRST_ELEMENT = 10;
    public static final int MAX_STEP = 10;
    public static final int MAX_NUMBER_OF_MISSING_ELEMENT = 9;

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
        int firstElem;
        int stepOfProgression;
        String[][] dataGame = new String[Engine.POINTS_TO_WIN][2];

        for (int j = 0; j < Engine.POINTS_TO_WIN; j++) {
            firstElem = RandomUtils.getLimitedRandomNumber(FIRST_ELEMENT);
            stepOfProgression = RandomUtils.getLimitedRandomNumber(MAX_STEP) + 1;
            int[] arithmeticProgression = getArithmeticProgression(firstElem, stepOfProgression, MAX_LENGTH);
            int numberOfMissingElement = RandomUtils.getLimitedRandomNumber(MAX_NUMBER_OF_MISSING_ELEMENT);
            StringBuilder tempElement = new StringBuilder("");
            for (int p = 0; p < MAX_LENGTH; p++) {
                if (p == numberOfMissingElement) {
                    tempElement.append(".. ");
                } else {
                    tempElement.append(arithmeticProgression[p]);
                    tempElement.append(" ");
                }
            }
            dataGame[j][Engine.DATA_QUESTION] = tempElement.toString();
            dataGame[j][Engine.DATA_ANSWER] = Integer.toString(arithmeticProgression[numberOfMissingElement]);
        }
        Engine.launch(dataGame, gameDescription);
    }
}
