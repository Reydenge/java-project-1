package hexlet.code;

public class RandomUtils {
    public static final int MAX_NUMBER = 200;
    public static int getLimitedRandomNumber(int limit) {
        return (int) (Math.random() * limit);
    }

}
