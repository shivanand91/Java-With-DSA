import java.util.*;

public class PrimeNumber {
    private static Object exit;

    public static void primeNumber(int n) {
        int div = 2;

        while (n > div) {
            if (n % div == 0) {
                System.out.println("Not prime number");
                break;
            } else {
                div = div + 1;
                System.out.println("Prime number");
                break;
            }

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number n: ");
        int n = sc.nextInt();

        primeNumber(n);
    }
}
