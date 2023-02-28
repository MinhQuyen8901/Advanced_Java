package Day4b.Ex2_9;

public class MyTriangle{
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3){
        v1 = new MyPoint(x1, y1);
        v2 = new MyPoint(x2, y2);
        v3 = new MyPoint(x3, y3);
        //Nên kiểm tra xem các điểm có trùng nhau hay khong
    }

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    @Override
    public String toString() {
        return "MyTriangle[" +
                "v1=" + v1.toString() +
                ", v2=" + v2.toString() +
                ", v3=" + v3.toString() +
                ']';
    }
    public double getPerimeter() {
        // a: v1v2, b: v1v3, c: v2v3
        double a = v1.distance(v2);
        double b = v1.distance(v3);
        double c = v2.distance(v3);
        return (a+b+c);
    }
    private String getType(){
        double a = v1.distance(v2);
        double b = v1.distance(v3);
        double c = v2.distance(v3);

        if(a==b && b==c){
            return "Equilateral";
        } else if(a==b || b==a || a==c){
          return "Isosceles";
        }
        else {
            return "Scalene";
        }
    }
}
