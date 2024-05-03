import java.util.Scanner;

public class Solution_06{

    public static void decToBin(int decNum){
        int pow = 0;
        int binNum = 0;
        int myNum = decNum;
        
        while(decNum > 0){
            int rem = decNum % 2;
            binNum = binNum + (rem * (int)(Math.pow(10, pow)));
            pow++;
            decNum = decNum / 2;
        }

        System.out.println(binNum);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter decimal number: ");
        int decNum = sc.nextInt();

       decToBin(decNum);
    }
}