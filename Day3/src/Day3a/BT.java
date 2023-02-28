package Day3a;

import java.util.Scanner;

public class BT {
    // Viết ctr nhập vào 1 mảng số thực (có thể gồm âm hoặc dương) là bán kính của hình tròn
    //a. có bao nhiêu hình tròn hợp le
    //b. Tính tổng chu vi của các hình tròn
    //c. Tìm ra hình tròn có chu vi lớn nhất
    // YÊU CẦU: sử dụng hàm để tnsh chu vi
    public static double getPi(){
        return 3.14;   //có return là có giá trị trả về
    }
    public  static double chuViHT(double r){
        double cv = 2 * getPi() * r;
        return cv;
    }
    public static void main(String[] args) {
        double [] arr = {4, 5, 6, 7, -7, -3};
        Scanner in = new Scanner(System.in);
        double t = 0;  // Tính tổng
        double dem = 0;  // Đếm hợp lệ
        double max=0;
        for(int i=0; i<arr.length;i++){  // chạy vòng lặp các giá trị trong mảng
            if(arr[i]>0){    // Nếu giá trị dương
                dem = dem + 1;
                t = t + chuViHT(arr[i]);
            }
        }
        System.out.println("a. Số hình tròn hợp lệ là: " + dem);
        System.out.println("b. Tổng chu vi : "+ t);
        }
    }
