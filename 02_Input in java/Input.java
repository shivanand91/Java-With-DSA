import java.util.*;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Integer data type
        System.out.print("Enter integer number: ");
        int a = sc.nextInt();
        System.out.println(a);
        
        // character input where single character is scanned
        System.out.print("Enter single cahracter: ");
        String ch = sc.next();
        System.out.println(ch);
        
        // String input where whole line is scanned
        System.out.print("Enter string: ");
        String name = sc.nextLine();
        System.out.println(name);
        
        // Byte input scanned
        System.out.print("Enter byte number: ");
        System.out.print("Enter byte number: ");
        byte number1 = sc.nextByte();
        System.out.println(number1);
        
        // Float input number is scanned
        System.out.print("Enter float number: ");
        float number2 = sc.nextFloat();
        System.out.println(number2);
        
        // double input scanned
        System.out.print("Enter double number: ");
        double number3 = sc.nextDouble();
        System.out.println(number3);
        
        // boolean data types 
        System.out.print("Enter boolean true/false: ");
        boolean result = sc.nextBoolean();
        System.out.println(result);
        
        // short data types
        System.out.print("Enter short number: ");
        short number4 = sc.nextShort();
        System.out.println(number4);
        
        // long data types
        System.out.print("Enter long number: ");
        long number5 = sc.nextLong();
        System.out.println(number5);
    }
}
