// print the largest of two number

import java.util.*;

public class Solution_03{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number one: ");
        int a = sc.nextInt();
        System.out.print("Enter number two: ");
        int b = sc.nextInt();
        System.out.print("Enter number three: ");
        int c = sc.nextInt();

        if(a > b){
            if(b > c){
            
                System.out.println("Number " + a + " is greater");
            }else{

                System.out.println("Number " + c + " is greater");
            }
        }
        else if(b > c){
            if(c > a){

                System.out.println("Number " + b + " is greater");
            }
            else{

                System.out.println("Number " + c + " is greater");
            }
        }
    }
}