package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.RandomUtils;

public class GameCalc {
    private static String gameDescription = "What is the result of the expression?\n";
    private final static int NUMBER_OF_OPETAROTS = 3;
    private static String[] listOfOperators = {"+", "-", "*"};
    private static int expression(int firstNumber, int secondNumber, String operator) {
        return switch (operator) {
            case "+" -> firstNumber + secondNumber;
            case "-" -> firstNumber - secondNumber;
            case "*" -> firstNumber * secondNumber;
            default -> throw new IllegalStateException("Unexpected operator");
        };
    }
    public static void calculation() {
        String randomExpression;
        int firstNumber;
        int secondNumber;
        String[][] dataGame = new String[Engine.POINTS_TO_WIN][2];
        for (int i = 0; i < Engine.POINTS_TO_WIN; i++) {
            firstNumber = RandomUtils.getRandomNumber();
            secondNumber = RandomUtils.getRandomNumber();
            randomExpression = listOfOperators[RandomUtils.getLimitedRandomNumber(NUMBER_OF_OPETAROTS)];
            dataGame[i][Engine.DATA_QUESTION] = firstNumber + " " + randomExpression + " " + secondNumber;
            dataGame[i][Engine.DATA_RIGHT_ANSWER] = String.valueOf(expression(firstNumber, secondNumber, randomExpression));
        }
        Engine.launchAnswerChecking(dataGame, gameDescription);
    }
}
