import java.util.*;

public class SumOfTwo{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int a = sc.nextInt();
        System.out.print("Enter number 2: ");
        int b = sc.nextInt();

        // int sum = a + b;

        System.out.print("Sum of two number is: "+ sumOfTwo(a, b));
    }

    public static int sumOfTwo(int a , int b){
        int sum = a + b;
        return sum;

    }
}