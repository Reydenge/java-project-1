package hexlet.code;
import hexlet.code.games.GameEven;
import hexlet.code.games.GameCalc;

import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter. \n 1 - Greet \n 2 - Even \n 0 - Exit");
        int gameNumber = in.nextInt();
        System.out.println("Your choice: " + gameNumber + "\n");

        switch (gameNumber) {
            case 0:
                return;
            case 1:
                Cli.greeting();
                break;
            case 2:
                GameEven.identifyEvenNumbers();
                break;
            case 3:
                GameCalc.calculation();
        }
    }
}
