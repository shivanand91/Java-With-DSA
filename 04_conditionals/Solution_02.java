import java.util.Scanner;

public class Solution_02 {
    public static void main(String[] args) {
        // print the largest of two number

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number one: ");
        int a = sc.nextInt();


        if (a % 2 == 0) {
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd number");
        }

    }
}
