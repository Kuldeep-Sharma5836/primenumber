import java.util.*;
public class KM_to_mile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kilometers = sc.nextInt();
        double miles = kilometers * 0.621371;
        System.out.println("The distance in miles is: " + miles);
    }
}
