import java.util.*;

public class AreaOfCircle {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter radius of a circle: ");
    int radius = sc.nextInt();


    double Area = 3.14 *(radius * radius);

    System.out.print("Area of circle is: " + Area);
 }   
}
