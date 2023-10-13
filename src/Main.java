import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(1,30);
        int b = random.nextInt(1,30);
        bolu(a,b);
    }

    static int bolu(int a, int b) {
            System.out.println("Чон сан " + Math.max(a,b));
            System.out.println("Кичине сан " + Math.min(b, a));





        return a;
    }
}
