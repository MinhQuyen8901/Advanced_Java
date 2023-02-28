package Day3b.HCN;

public class main_HCN {
    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
    public static void main(String[] args) {
        //Tao h1
        hinhChuNhat h1 = new hinhChuNhat();  // phuong thuc khởi tạo rộng
        h1.chieuDai = 5;
        h1.chieuRong = 6;

        //Tao h2
        hinhChuNhat h2 = new hinhChuNhat(6,7);  // Phương thức khởi tạo đầy đủ tham số

        // Tính chu vi, dt
        System.out.println(h1.dienTich());
        System.out.println(h2.chuVi());

        //Tạo mảng luu 10 hinh chư nhật
        hinhChuNhat[] arr = new hinhChuNhat[10];
        for(int i=0; i<10; i++){
            double chieuDai = getRandomNumber(10,20);
            double chieuRong = getRandomNumber(20,30);
            arr[i] = new hinhChuNhat(chieuDai, chieuRong);
            System.out.println(arr[i].toString());
        }
        //Tim hinh chu nhat có dien tich lon nhat
        double dtMax = arr[0].dienTich();
        int vtMax=0;
        for(int i=1; i<10; i++){
            if(dtMax < arr[i].dienTich()){
                vtMax = i;
                dtMax = arr[i].dienTich();
            }
        }
        System.out.println("Hình chữ nhật có diện tích lớn nhất: ");
        System.out.println(arr[vtMax].toString());
    }
}
