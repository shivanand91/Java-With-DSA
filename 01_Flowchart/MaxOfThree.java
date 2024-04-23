import java.util.*;

public class MaxOfThree {
    public static void maxOfThree(int a, int b, int c){
            
        if(a > b){
            if(b > c){
                System.out.println("Number a is greater");
            }
            else{
                System.out.println("NUmber c is greater");
            }
        }
        else if(b > c){
            if(c > a){
                System.out.println("Number b is greater");
            }
            else{
                System.out.println("Number c is greater");
            }
        }
        else{
            System.out.println("Number c is greater");
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number a: ");
        int a = sc.nextInt();
        System.out.print("Enter Number b: ");
        int b = sc.nextInt();
        System.out.print("Enter Number c: ");
        int c = sc.nextInt();

        maxOfThree(a, b, c);

    }
}
