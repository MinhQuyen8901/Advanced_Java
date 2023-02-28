package Day3b.HinhTron;

import java.util.Scanner;

public class Thu_tuc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap r: ");
        int r = in.nextInt();
        // kiểm tra
        if(r<=0){
            System.out.println("Không hợp lệ");
            System.exit(0);
        }
        else{
            double cv = 2*Math.PI*r;
            double dt = 2*Math.PI*r*r;
            System.out.printf("HinhTron[chuVi=%.2f; dientich=%.2f]", cv,dt);
        }
    }
}
