import java.util.*;
public class PerimeterOfrect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int width = sc.nextInt();
        int perimeter = 2 * (length + width);
        System.out.println("The perimeter of the rectangle with length " + length + " and width " + width + " is: " + perimeter);
    }
}
