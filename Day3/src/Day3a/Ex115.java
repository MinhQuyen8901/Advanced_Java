package Day3a;

import java.util.Scanner;

public class Ex115 {
    //115. Viết chương trình nhập họ tên, điểm toán, điểm văn của một học sinh.
    //Tính điểm trung bình và xuất kết quả
    public static void inThongTin(String hoTen, double diemToan, double diemVan){   // void là không có giá trị trả về
       if(diemVan<0 || diemVan >10 || diemToan<0 || diemToan >10){
           System.out.println("Không hợp lệ");
           return;
       }
       double tb = (diemVan+diemToan)/2;
       System.out.printf("HocSinh[hoTen: %s, diemTB:%.2f]\n", hoTen,tb);
    }
    public static void main(String[] args) {
        inThongTin("Nguyen Van A",8,7);
        inThongTin("Nguyen Van B",-9,7);
        }
    }
