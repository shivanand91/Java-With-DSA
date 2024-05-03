// this is the program to find a number is prime or not.

import java.util.Scanner;

public class Solution_04 {
   
    public static void isPrime(int n){
 
        int div = 2;

        if(n == 2){
            System.out.println("Prime Number");
        }

        while(div < n){

            if(n % div == 0){
                System.out.println("Number is not prime");
                return;
            }
            else{

                div++;
            }
            System.out.println("Number is prime");
            return;
        }
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        isPrime(n);
      
    }
}
