package Day3b.BaiTap2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class main_SV {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Sinh viên 1: // cần có construction đầy đủ thông tin
        SinhVien s1 = new SinhVien(2019601700, "Nguyễn Minh Quyền", 8, 9);
        System.out.println(s1);

        //Sinh viên 2: // cần có construction đầy đủ thông tin
        SinhVien s2 = new SinhVien(2019602132, "Phùng Văn Tưởng", 7, 8);
        System.out.println(s2);

        //Sinh viên 3: cách này cần có Scanner in = new Scanner(System.in);
        SinhVien s3 = new SinhVien();  // cần có construction rỗng
        System.out.print("Nhập maSV: ");
        s3.setMaSV(in.nextInt());
        in.nextLine();// để trước nhập in.nextLine để k bị lỗi
        System.out.print("Nhập hoVaTen: ");
        s3.setHoVaTen(in.nextLine());
        System.out.print("Nhập diemLT: ");
        s3.setDiemLT(in.nextFloat());
        System.out.print("Nhập diemTH: ");
        s3.setDiemTH(in.nextFloat());
        System.out.println(s3);
    }
}
