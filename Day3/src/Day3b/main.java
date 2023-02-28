package Day3b;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        // De sung class-> cần tạo ra cascc dối tượng cụ thể
        Dog d1 = new Dog();
        d1.name = "Cho bec ";
        d1.age = 1;
        d1.color = "Den";

        //Sử dung ác phuong thuc
        d1.eat();
        d1.run();
        //Tao 1 đối tượng Dog d2->  Nhập dữ liệu từ bàn phím
        Scanner in = new Scanner(System.in);
        Dog d2 = new Dog();
        System.out.print("Nhap ten: ");
        d2.name=in.nextLine();
        System.out.print("Nhap tuoi: ");
        d2.age=Integer.parseInt(in.nextLine());
        System.out.print("Nhap mau: ");
        d2.color=in.nextLine();
        in.close();
        d2.run();

    }
}
