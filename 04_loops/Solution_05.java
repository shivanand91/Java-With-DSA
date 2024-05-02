// this is the program of check a number is prime or not

import java.util.Scanner;

public class Solution_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ente a number: ");
        int n = sc.nextInt();
        int div = 2;
        
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
    
}
