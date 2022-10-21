package hexlet.code;

public class Engine {
    public static int winCount = 0;
    public static int failCount = 0;
    public static int countForWin = 3;
    public static int countForLose = 0;

    public static int getRandomNumber() {
        return (int) (Math.random() * (200 - 10 + 1) + 10);
    }

    public static void question(int n) {
        System.out.println("Question: " + n);
    }

    public static void congratulation(String name) {
        System.out.println("Congratulation, " + name + "!");
    }

    public static void finishWithWin() {
        System.out.println("Correct!");
    }

    public static void restart(String name) {
        System.out.println("Let's try again, " + name + "!");
    }

    public static void checkAnswerNum(int playerAnswer, int rightAnswer) {
        if (playerAnswer == rightAnswer) {
            Engine.finishWithWin();
            winCount++;
        } else {
            System.out.println("'" + playerAnswer + "'" + " is wrong answer ;(. Correct answer was " + "'" + rightAnswer + "'");
            failCount++;
        }

        if (failCount > countForLose) {
            restart(Cli.getPlayerName());
        } else if (winCount >= countForWin) {
            Engine.congratulation(Cli.getPlayerName());
        }
    }

    public static void checkAnswerWord(String playerAnswer, String rightAnswer) {

        if (playerAnswer.equals(rightAnswer)) {
            Engine.finishWithWin();
            winCount++;
        } else {
            System.out.println("'" + playerAnswer + "'" + " is wrong answer ;(. Correct answer was " + "'" + rightAnswer + "'");
            failCount++;
        }


        if (failCount > countForLose) {
            restart(Cli.getPlayerName());
        }
        else if (winCount == countForWin) {
            Engine.congratulation(Cli.getPlayerName());
        }
    }
}
