package hexlet.code;
import hexlet.code.games.GameEven;
import hexlet.code.games.GameCalc;

import java.util.Scanner;
public class App {
    static final int EXIT = 0;
    static final int GREETING = 1;
    static final int GAME_EVEN_NUMBERS = 2;
    static final int GAME_CALCULATOR = 3;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("""
                Please enter the game number and press Enter.
                 1 - Greet\s
                 2 - Even\s
                 3 - Calc\s
                 0 - Exit""");
        int gameNumber = in.nextInt();
        System.out.println("Your choice: " + gameNumber + "\n");

        switch (gameNumber) {
            case EXIT:
                return;
            case GREETING:
                Engine.greeting();
                break;
            case GAME_EVEN_NUMBERS:
                GameEven.identifyEvenNumbers();
                break;
            case GAME_CALCULATOR:
                GameCalc.calculation();
                break;
            default:
        }
    }
}
