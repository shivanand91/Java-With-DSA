import java.util.Scanner;

public class Solution_02 {

    public static int sumOfTwo(int a, int b){
        int sum = a + b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number a: ");
        int a = sc.nextInt();
        System.out.print("Enter number b: ");
        int b = sc.nextInt();
    
        System.out.println("Sum of two number is: " + sumOfTwo(a, b));

    }
}
