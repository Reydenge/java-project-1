package hexlet.code;

public class RandomUtils {
    public static int getRandomNumber() {
        return (int) (Math.random() * (200 - 10 + 1) + 10);
    }

    public static int getLimitedRandomNumber(int limit) {
        return (int) (Math.random() * limit);
    }

}
