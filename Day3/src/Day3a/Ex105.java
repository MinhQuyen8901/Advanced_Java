package Day3a;

import java.util.Scanner;

public class Ex105 {
    //Input: số
    //Output: string
    public static String soSangChu(int n) {
        String[] so = {"Không", "Một", "Hai", "Ba", "Bốn", "Năm", "Sáu", "Bảy", "Tám", "Chín"};
        if (n < 0 || n > 99) {
            return "Không thể thuc hiện";
        }
        if (n < 10) {
            return so[n];
        }
        // Còn lại là lớn hơn 10 đến 99
        // Xác định chục v đơn vị
        //VD: n=21
        int chuc = n / 10;  //2
        int donVi = n % 10;  //1

        //tạo 1 chuỗi rong để lưu cách đọc
        String tmp = "";
        //Xử lý hàng chuc, don vi
        if (chuc == 1) {
            tmp += "Mười";
            if (donVi == 1) {
                tmp += " một";
            } else if (donVi == 5) {
                tmp += " lăm";
            } else if (donVi != 0) {
                tmp = tmp + " " + so[donVi];
            }
        } else {
            tmp = tmp + so[chuc] + " mươi";
            if (donVi == 1) {
                tmp += " mốt";
            } else if (donVi == 5) {
                tmp += " lăm";
            } else {
                tmp += so[donVi];
            }
        }
        return tmp;
    }

    public static void main(String[] args) {
        System.out.println(soSangChu(0));
        System.out.println(soSangChu(25));
        System.out.println(soSangChu(19));
        System.out.println(soSangChu(5));
        System.out.println(soSangChu(21));
    }
}
