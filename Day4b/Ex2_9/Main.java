package Day4b.Ex2_9;

public class Main {
    public static void main(String[] args) {
        MyPoint A = new MyPoint(0,3);
        MyPoint B = new MyPoint(3,0);
        MyPoint C = new MyPoint(0,-3);

        MyTriangle myTriangle = new MyTriangle(A,B,C);
        System.out.println(myTriangle);
        System.out.println(myTriangle.getPerimeter());
    }
}
