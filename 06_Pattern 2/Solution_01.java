// this is the program of print a hollow rectangle pattern 

import java.util.Scanner;

public class Solution_01 {

    public static void hollow_rectangle(int rows, int column){
        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <= column; j++){
                if(i == 1 || j == 1 || i == rows || j == column){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter thw number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter thw number of column: ");
        int column = sc.nextInt();
        hollow_rectangle(rows, column);
    }
}
