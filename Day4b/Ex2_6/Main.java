package Day4b.Ex2_6;

public class Main {
    public static void main(String[] args) {
        // Test program to test all constructors and public methods
        MyPoint p1 = new MyPoint();                  // Test constructor
        System.out.println(p1.toString());           // Điểm đầu x,y = {0,0}

        p1.setX(8);                                  // Test setter for x
        p1.setY(6);                                  // Test setter for y
        System.out.println("x is: " + p1.getX());    // Test getter for x
        System.out.println("y is: " + p1.getY());    // Test getter for y
        System.out.println(p1);


        p1.setXY(3, 0);                        // Test setXY()
        System.out.println("x=" + p1.getXY()[0]);     // lấy x từ điểm (3,0)
        System.out.println("y=" + p1.getXY()[1]);  //lấy y từ điểm (3,0)
        System.out.println(p1);

        MyPoint p2 = new MyPoint(0, 4);        // Test another constructor
        System.out.println(p2);                      // Test toString()
        // Testing the overloaded methods distance()
        System.out.println("Khoảng cách từ  p1 đến p2: " + p1.distance(p2));         // Overloaded distance() with MyPoint parameter
        System.out.println("Khoảng cách từ  p2 đến p1: " +p2.distance(p1));         // Overloaded distance() with MyPoint parameter
        System.out.println("Khoảng cách từ  p1 đến điểm (5,6): "+ p1.distance(5, 6)); // Overloaded distance() with x, y parameters
        System.out.println("Khoảng cách từ  p1 đến tọa độ (0,0): "+ p1.distance());           // Overloaded distance() with no parameters
    }
}
