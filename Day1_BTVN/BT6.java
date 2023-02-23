package Day1_BTVN;

import java.util.Scanner;

public class BT6 {
    //6. Nhập vào 3 số a, b, c từ bàn phím, Hỏi a, b, c có phải 3 cạnh của tam giác hay ko?
    //Nếu có hãy tính chu vi và diện tích.
    public static void main(String[] args) {
        //Bước 1: nhập dữ liệu
        Scanner in = new Scanner(System.in);
        System.out.print("Nhập 3 cạnh tam giác: ");
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        in.close();
        // test
        if(a>0 && b>0 && c>0 && (a+b>c) && (a+c>b) && (b+c>a)) {
            System.out.println("a,b,c có là 3 cạnh của tam giác");}
        else
        {System.out.println("a,b,c không phải 3 cạnh tam giác");
            System.exit(0);}
        //Bước 2: tính toasnvaf hiển thị
            double cv = a + b + c;
            double p = cv / 2;
            double dt = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            System.out.printf("Tamgiac[Chuvi = %.2f; Dientich = %.2f", cv, dt);
    }
}
