public class question42 () {

        System.out.print("Enter base: ");
        long base = in.nextLong();
        System.out.print("\nEnter height: ");
        long height = in.nextLong();
        System.out.print("\nEnter hypotenuse: ");
        long hypotenuse = in.nextLong();
        if((base * base) + (height * height) == (hypotenuse * hypotenuse)) {
            System.out.print("\nYes, that's a right triangle!");
        } else {
            System.out.print("Nope...not a right triangle");
        }
}
