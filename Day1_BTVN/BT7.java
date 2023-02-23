package Day1_BTVN;

import java.util.Scanner;

public class BT7 {
    // 7. Viết chương trình tính chu vi và diện tích hình chữ nhật.
    public static void main(String[] args) {
        //Bước 1: Nhập dữ liệu
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap chieu dai a, chieu rong b: ");
        double a = in.nextDouble();
        double b = in.nextDouble();
        // test
        if(a>0 && b>0)
            System.out.println("a, b là 2 cạnh hình chữ nhật");
        else
        {System.out.println("a, b không l 2 cạnh hình chữ nhật");
            System.exit(0);}
        // Bước 2: tính toán hiển thị
        double cv = 2*(a+b);
        double dt = a*b;
        System.out.printf("HinhChuNhat[ChuVi = %.2f; DienTich = %.2f", cv, dt);
    }
}
