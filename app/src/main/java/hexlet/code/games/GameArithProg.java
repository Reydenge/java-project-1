package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomUtils;

public class GameArithProg {
    public static String gameDescription = "What number is missing in the progression?\n";
    public final static int MAX_LENGTH_OF_PROGRESSION = 10;
    public final static int FIRST_ELEMENT_OF_PROGRESSION = 10;
    public final static int MAX_STEP_OF_PROGRESSION = 10;
    public final static int MAX_NUMBER_OF_MISSING_ELEMENT = 9;

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
        String[][] dataGame = new String[Engine.POINTS_TO_WIN][2];

        for (int j = 0; j < Engine.POINTS_TO_WIN; j++) {
            firstElement = RandomUtils.getLimitedRandomNumber(FIRST_ELEMENT_OF_PROGRESSION);
            stepOfProgression = RandomUtils.getLimitedRandomNumber(MAX_STEP_OF_PROGRESSION) + 1;
            int[] arithmeticProgression = getArithmeticProgression(firstElement, stepOfProgression, MAX_LENGTH_OF_PROGRESSION);
            int numberOfMissingElement = RandomUtils.getLimitedRandomNumber(MAX_NUMBER_OF_MISSING_ELEMENT);
            StringBuilder tempElement = new StringBuilder("");
            for (int p = 0; p < MAX_LENGTH_OF_PROGRESSION; p++) {
                if (p == numberOfMissingElement) {
                    tempElement.append(".. ");
                } else {
                    tempElement.append(Integer.toString(arithmeticProgression[p]));
                    tempElement.append(" ");
                }
            }
            dataGame[j][Engine.DATA_QUESTION] = String.valueOf(tempElement);
            dataGame[j][Engine.DATA_RIGHT_ANSWER] = Integer.toString(arithmeticProgression[numberOfMissingElement]);
        }
        Engine.launchAnswerChecking(dataGame, gameDescription);
    }
}
