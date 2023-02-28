package Day4b.Ex6_1;

public class Square extends Rectangle{
    private double side;

    public Square() {
    }

    public Square(double side) {
        super(side,side);
    }

    public Square(String color, boolean filled, double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setWidth(double side){
        super.setWidth(side);
        super.setLength(side);
    }
    public void setLength(double side){
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public String toString() {
        return "Square[Rectangle[Shape[color=" + color +
                ",filled="+ filled + ']' +
                "width=" + side +
                ", length=" + side +
                ']';
    }
}
