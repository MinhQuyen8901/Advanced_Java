package Day3b.Baitap3;

import java.util.Scanner;

public class main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Cách 1
        PhuongTien p1 = new PhuongTien();  // cần có construction rỗng
        p1.setMaXe("Honda");
        p1.setTenXe("Wave");
        p1.setMauXe("Trắng");
        p1.setGiaXe(1000);
        p1.setDungTich(90);
        System.out.println(p1);
        System.out.println("Thue truoc ba "+ p1.thueTruocBa());

        //Cách 2:  cần có construction đầy ủ thông tin
        PhuongTien p2 = new PhuongTien("Honda", "SH", "Đen", 5000, 150);
        System.out.println(p2);
        System.out.println("Thue truoc ba: "+p2.thueTruocBa());

        // Cách 3 phải có    Scanner in = new Scanner(System.in);
        PhuongTien p3 = new PhuongTien();  // cần có construction rỗng
        System.out.print("Nhập mã xe: ");
        p3.setMaXe(in.nextLine());
        System.out.print("Nhập tên xe: ");
        p3.setTenXe(in.nextLine());
        System.out.print("Nhập màu xe: ");
        p3.setMauXe(in.nextLine());
        System.out.print("Nhập giá xe: ");
        p3.setGiaXe(in.nextDouble());
        System.out.print("Nhập dung tích xe:");
        p3.setDungTich(in.nextInt());
        System.out.println(p3);
        System.out.println("Thue truoc ba: "+ p3.thueTruocBa());
    }
}
