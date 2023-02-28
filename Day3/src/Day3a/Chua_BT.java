package Day3a;

import java.util.Scanner;

public class Chua_BT {
    // Viết ctr nhập vào 1 mảng số thực (có thể gồm âm hoặc dương) là bán kính của hình tròn
    //a. có bao nhiêu hình tròn hợp le
    //b. Tính tổng chu vi của các hình tròn
    //c. Tìm ra hình tròn có chu vi lớn nhất
    // YÊU CẦU: sử dụng hàm để tnsh chu vi
    public static double tinhChuVi(double r){
        return 2*Math.PI*r;
    }
    public static void main(String[] args) {
        //Bước 1: Nhập mảng số thực, n, chi tiết các giá trị
        Scanner in = new Scanner(System.in);
        System.out.print("Nhập kích thước mảng: ");
        int n = in.nextInt();
        //Nhập chi tiết cho mảng
        double[] arr = new double[n];
        for(int i=0; i<n; i++){
            System.out.printf("arr[%d]=",i);
            arr[i]= in.nextDouble();
        }
        //Duyệt mảng số thực
        int count=0;
        double tongCV=0, maxCV=0;
        for(int i=0; i<n; i++){
            if(arr[i]>0){  // Nếu giá trị trong mảng dương
                count++;  // Tăng đếm
                double cv = tinhChuVi(arr[i]);  // Tính chu vi giá trị đó
                if(cv>maxCV){  // Nếu chu vi đón lớn hơn max
                    maxCV=cv;
                }
                tongCV = tongCV + cv;
            }
        }
        System.out.println("a. Số hình tròn hợp lệ là: " + count);
        System.out.println("b. Tổng chu vi : "+ tongCV);
        System.out.println("c. Chu vi lớn nhất là: "+ maxCV);
    }
}
