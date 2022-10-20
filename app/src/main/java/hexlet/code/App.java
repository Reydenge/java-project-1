package hexlet.code;
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
                System.out.println("Welcome to the Brain Games!");
                Cli.getName();
                break;
            case 2:
                GamesLogic.evenNumbers();
                break;
        }
    }
}
