package oops_constructor;
public class Car {
    // Data Members
    private String color;
    private int price;
    private int speed;
    ////--------OR--------////
        // private String Color;
        // private int Price;
        // private int Speed;
    // Constructor
    public Car(String color, int price, int speed) {
        this.color = color;
        this.price = price;
        this.speed = speed;
        ////---------OR---------////
        // Color=color;
        // Price = price;
        // Speed = speed;
    }

    // Display Function
    public void Displaycar() {
        System.out.println("Color : " + color);
        System.out.println("Price : " + price);
        System.out.println("Speed : " + speed);
        System.out.println();
    }

    // ===========================
    // Getters
    // ===========================

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    public int getSpeed() {

        
        if (speed < 0) {
            return 0;
        }
        return speed;
    }

    // ===========================
    // Setters (Simple Version)
    // ===========================

    // public void setColor(String color) {
    //     this.color = color;
    // }

    // public void setSpeed(int speed) {

    //     if (speed < 0) {
    //         return;
    //     }

    //     this.speed = speed;
    // }

    /*
     * Version 1
     * Using return statement
     */

    public void setPrice(int price) {

        if (price < 0) {
            return;
        }

        this.price = price;
    }

    /* 
     * ==================================================
     * Version 2 (Alternative)
     * Try Catch Finally
     * ==================================================
     *
     * Uncomment to use
     *
     * public void setPrice(int price) {
     *
     *     try {
     *
     *         if(price < 0) {
     *             throw new Exception(
     *                 "Bklol price kabhi -ve nhi hota hai"
     *             );
     *         }
     *
     *         this.price = price;
     *
     *     }
     *     catch(Exception e) {
     *         e.printStackTrace();
     *     }
     *     finally {
     *         System.out.println("i am in finaly");
     *     }
     * }
*/
    /*
     * ==================================================
     * Version 3 (Alternative)
     * throws Exception
     * ==================================================
     *
     * Uncomment to use
     *
     * public void setPrice(int price) throws Exception {
     *
     *     if(price < 0) {
     *         throw new Exception(
     *             "Bklol price kabhi -ve nhi hota hai"
     *         );
     *     }
     *
     *     this.price = price;
     * }
     *
     */

    // ===========================
    // Capitalized Versions
    // (Seen in lecture screenshots)
    // ===========================

    public void SetColor(String color) {
        this.color = color;
    }

    public void SetPrice(int price) {
        this.price = price;
    }

    public void SetSpeed(int speed) {
        this.speed = speed;
    }
}