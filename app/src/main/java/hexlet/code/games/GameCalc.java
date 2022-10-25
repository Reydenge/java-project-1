package hexlet.code.games;
import hexlet.code.Engine;

public class GameCalc {
    private static String gameDescription = "What is the result of the expression?\n";
    private static String[] listOfOperators = {"+", "-", "*"};
    private static int expression(int firstNumber, int secondNumber, String operator) {
        return switch (operator) {
            case "+" -> firstNumber + secondNumber;
            case "-" -> firstNumber - secondNumber;
            case "*" -> firstNumber * secondNumber;
            default -> 0;
        };
    }
    public static void calculation() {
        String randomExpression;
        int firstNumber;
        int secondNumber;
        String[][] dataGame = new String[Engine.pointsToWin][2];
        Engine.greeting();
        for (int i = 0; i < Engine.pointsToWin; i++) {
            firstNumber = Engine.getRandomNumber();
            secondNumber = Engine.getRandomNumber();
            int numberOfOperators = 3;
            randomExpression = listOfOperators[Engine.getLimitedRandomNumber(numberOfOperators)];
            dataGame[i][Engine.dataPlayerAnswer] = Integer.toString(firstNumber) + " " + randomExpression + " " + Integer.toString(secondNumber);
            dataGame[i][Engine.dataRightAnswer] = Integer.toString(expression(firstNumber, secondNumber, randomExpression));
        }
        Engine.checkAnswerWord(dataGame, gameDescription);
    }
}
