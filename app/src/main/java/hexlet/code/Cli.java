package hexlet.code;

import java.util.Scanner;

public class Cli {
    private String name;

    Cli(String name) {
        this.name = name;
    }

    public static void getName() {
        Scanner in = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String name = in.nextLine();
        System.out.println("Hello, " + name + "!");
    }

}
