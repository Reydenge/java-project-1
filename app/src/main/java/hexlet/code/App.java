package hexlet.code;
import hexlet.code.games.GameArithProg;
import hexlet.code.games.GameEven;
import hexlet.code.games.GameCalc;
import hexlet.code.games.GameGCD;

import java.util.Scanner;
public class App {
    static final int EXIT = 0;
    static final int GREETING = 1;
    static final int GAME_EVEN_NUMBERS = 2;
    static final int GAME_CALCULATOR = 3;
    static final int GAME_GCD = 4;
    static final int GAME_ARITHMETIC_PROGRESSION = 5;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("""
                Please enter the game number and press Enter.
                 1 - Greet\s
                 2 - Even\s
                 3 - Calc\s
                 4 - GCD\s
                 5 - Progression\s
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
            case GAME_GCD:
                GameGCD.calculateGCD();
                break;
            case GAME_ARITHMETIC_PROGRESSION:
                GameArithProg.createArithmeticProgression();
            default:
        }
    }
}
