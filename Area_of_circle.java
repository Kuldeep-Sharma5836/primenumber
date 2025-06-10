import java.util.*;
public class Area_of_circle{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int radius = sc.nextInt();
        double area = 3.14 * radius * radius;
        System.out.println("The area of the circle with radius " + radius + " is: " + area);
    }
}