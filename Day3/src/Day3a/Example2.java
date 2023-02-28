package Day3a;

public class Example2 {
    // Loại 1: ko có tham số, không có giá trị trả về
    public static void sayHello(){  // void là không có giá trị trả về
        System.out.println("Hello");   // k có return là k có giá trị trả về
    }
    // Loại 2: ko có tham số, có giá trị trả về
    public static double getPi(){
        return 3.14;   //có return là có giá trị trả về
    }
    // Loại 3: có tham số, nhưng không có giá trị trả về
    public static void chuViHT(double r){   // void là không có giá trị trả về
        double cv = 2 * 3.14 * r;
        System.out.println("Chu vi: "+cv);
    }
    // Loại 4: có tham số, có giá trị trả về
    public  static double dienTichHT(double r){
        double dt = getPi()*r*r;
        return dt;
    }
    public static void main(String[] args) {
        // Loại 1
        sayHello();
        sayHello();
        // Loại 2
        double myPi = getPi();
        System.out.println("Chu vi hinh tron r = 2 là: "+(myPi*2*2));
        // Loại 3
        chuViHT(5);
        // Loại 4

    }
}
