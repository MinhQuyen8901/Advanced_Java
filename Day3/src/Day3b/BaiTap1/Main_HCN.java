package Day3b.BaiTap1;

import java.util.Scanner;

public class Main_HCN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Cách 1
        HinhChuNhat h1 = new HinhChuNhat();  // Cần có construction rỗng
        h1.setChieuDai(3);
        h1.setChieuRong(4);
        System.out.println(h1);
        //Cách 2: cần có Scanner in = new Scanner(System.in);
        HinhChuNhat h2 = new HinhChuNhat();  // Cần có construction rỗng
        System.out.print("Nhập chiều dài: ");
        h2.setChieuDai(in.nextDouble());
        System.out.print("Nập chiều rộng: ");
        h2.setChieuRong(in.nextDouble());
        System.out.println(h2);
        //Cách 3
        HinhChuNhat h3 = new HinhChuNhat(7,9); // cần có construction đầy đủ thông tin
        System.out.println(h3);
    }
}
