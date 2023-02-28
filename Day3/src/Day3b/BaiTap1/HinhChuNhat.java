package Day3b.BaiTap1;

public class HinhChuNhat {
    //Thuộc tính
    private double chieuDai = 1;
    private double chieuRong = 1;

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        if(chieuRong<=0){
            System.out.println("Canh phải là số dương");
            System.out.println("Chiều rộng hiện tại: "+ this.chieuRong);
            return;
        }
        this.chieuRong = chieuRong;
    }

    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        //thực tế: nem ra exception
        if(chieuDai<=0){
            System.out.println("Canh phải là số dương");
            System.out.println("Chiều dài hiện tại: "+ this.chieuDai);
            return;
        }
        this.chieuDai = chieuDai;
    }
    //Phương thức
    public HinhChuNhat(double chieuDai, double chieuRong) {  // construction đầy đủ (phương thức)
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }
    public HinhChuNhat(){ //construction rỗng (phương thức)

    }

    public double chuVi(){
        return (chieuRong + chieuDai)*2;
    }
    public double dienTich(){
        return (chieuDai*chieuRong);
    }

    @Override
    public String toString() {
        return "HinhChuNhat{" +
                "chieuDai=" + chieuDai +
                ", chieuRong=" + chieuRong +
                ", chuVi =" + chuVi() +
                ", dientich =" + dienTich() +
                '}';
    }
}
