package hexlet.code;

public class Engine {
    public static int getRandomNumber(){
        return (int) (Math.random() * (200 - 10 + 1) + 10);
    }

    public static void question(int n){
        System.out.println("Question: " + n);
    }

    public static void congratulation(String name){
        System.out.println("Congratulation, " + name + "!");
    }

    public static void correct(){
        System.out.println("Correct!");
    }

    public static void uncorrectYes(){
        System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.\nLet's try again");
    }

    public static void uncorrectNo(){
        System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.\nLet's try again");
    }

    public static void uncorrectInput(){
        System.out.println("Your answer is wrong ;(.\nLet's try again");
    }
}
