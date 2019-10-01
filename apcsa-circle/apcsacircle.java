import java.util.Scanner;

public class apcsacircle {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("\nEnter the diameter of the circle: ");
        double diameter = in.nextDouble();
        double area = Math.PI * (Math.pow(diameter / 2, 2));
        System.out.printf("The area of a circle with a diameter of %.1f is %.1f.\n", diameter, area);
        in.close();
    }
}
