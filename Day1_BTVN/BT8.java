package Day1_BTVN;

import java.util.Scanner;

public class BT8 {
//    Viết chương trình tính tiền thuê phòng như sau:
//            - Giá phòng = giá cố định (theo hợp đồng) + tiền điện + tiền nước + dịch vụ...
//            - Tiền điện: 4k/1 số
//- Tiền nước: 30k/1 khối
//- Dich vụ khác: chủ động nhập thêm
//
//    Lưu ý: nhập tiền điện tháng trước/ này, số nước trước/này -> tính tự đông
public static void main(String[] args) {
        // Bước 1: Nhạp như liệu
        Scanner in = new Scanner(System.in);
        System.out.print("So dien thang truoc là: ");
        double a = in.nextDouble();
        System.out.print("So dien thang nay là: ");
        double b = in.nextDouble();
        System.out.print("So nuoc thang truoc là: ");
        double c = in.nextDouble();
        System.out.print("So nuoc thang nay là: ");
        double d = in.nextDouble();
        // test
        if(b<a)
                {System.out.print("Số điện sai");
                System.exit(0);}
        if(d<c)
                {System.out.print("Số nước sai");
                System.exit(0);}
        //Bước 2: Tính toán
        double giaphong = 2000000;
        double tiendien = (b-a)*4000;
        double tiennuoc = (d-c)*30000;
        double dichvu = 10000;
        double Tong = giaphong + tiendien + tiennuoc + dichvu;
        //Bước 3: Hiển thị
        System.out.printf("Số tiền phải thanh toán la: %.2f", Tong);
}
}
