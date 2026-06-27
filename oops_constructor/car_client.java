package oops_constructor;

// import java.lang.*;

public class car_client {

    public static void main(String[] args) throws Exception {

        // Creating Objects

        Car c = new Car("Black", 1929, 25);
        Car c1 = new Car("Red", 19029, 23);

        // int x = Integer.MAX_VALUE;

        // Initial Data

        c.Displaycar();
        c1.Displaycar();

        // Updating Color

        c.SetColor("Green");

        // Updating Price

        c.setPrice(-1000);

        // If using Version 3 (throws Exception),
        // then the exception will propagate to main

        // Display After Changes

        c.Displaycar();

        System.out.println("hey");

        // Getter Examples

        System.out.println(c.getColor());

        System.out.println(c1.getPrice());

        System.out.println(c.getSpeed());

        // Capitalized Setter Examples

        c.SetColor("Blue");
        c.SetPrice(5000);
        c.SetSpeed(120);

        System.out.println();
        System.out.println("After Capitalized Setters");

        c.Displaycar();
    }
}