package Day4b.Ex6_1;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];
        //Shape 1 = hình tròn
        shapes[0] = new Circle(3);
        //Shape 2 = hình chữ nhạt
        shapes[1] = new Rectangle(4,5);
        //Shape 3 = HT
        shapes[2] = new Circle(4);
        //Shape 4 = hình vuông
        shapes[3] = new Square(3);
        //Shape 5 = hình vuông
        shapes[4] = new Square(5);

        //In ra chu vi, diện tích các hình
        for (int i=0;i<shapes.length; i++){
            System.out.println(shapes[i].toString());
            System.out.printf("Chu vi = %.2f. dien tich = %.2f\n", shapes[i].getPerimeter(), shapes[i].getArea());
        }

    }
}
