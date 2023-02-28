package Day4b.Ex2_6;

public class MyPoint {
    private int x = 0;
    private int y = 0;

    public MyPoint() {
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
//    public int[] getXY(){
//        int [] xy = new int[2];  //Khai báo và khởi tạo mảng int 2 phần tử
//        xy[0] = this.x;
//        xy[1] = this.y;
//        return xy;
//    }
        public int[] getXY(){
            return new int[]{x,y};
        }

    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("(%d, %d)", x,y);
    }
    public double distance(int x, int y) { // Two int parameters
        return Math.sqrt((this.x - x)*(this.x - x) + (this.y - y)*(this.y - y));
    }

//    public double distance(MyPoint another) { // One MyPoint parameter
//        int xDiff = this.x - another.x;
//        int yDiff = this.y - another.y;
//        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
//    }
    //hoặc
        public double distance(MyPoint another) { // One MyPoint parameter
                return distance(another.x, another.y);
            }

    public double distance() { // No parameters
        int xDiff = this.x - 0;
        int yDiff = this.y - 0;
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }
    //Hoặc
//    public double distance() { // No parameters
//        return Math.sqrt((this.x - 0)*(this.x - 0) + (this.y - 0)*(this.y - 0));
//    }
}
