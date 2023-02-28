package Day3b.HCN;

public class hinhChuNhat {
    //a. Viết class HinhChuNhat có 2 thuộc tính
    //+ chieuRong: double
    //+ chieuDai: double
    // Có 2 phương thức khởi tạo:
    //+ 1 phương thức khởi tạo rỗng
    //+ 1 phương thức đầy đủ tham số
    //public HinhChuNhat(double chieuDai, double chieuRong){
    //      this.chieuDai = chieuDai;
    //      this.chieuRong = chieuRong;
    //}
    // Có 2 phương thức: tính chu vi và tính diện tích giá trị trả về double
    //b. Tạo mảng gồm 10 đối tượng HinhChuNhat
    // -> in ra thông tin của hình chữ nhật có diện tích lớn nhất

    //Thuộc tính
    double chieuDai;
    double chieuRong;
    public hinhChuNhat(){}
    public hinhChuNhat(double chieuDai, double chieuRong){
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }
    public double chuVi(){
        return(chieuDai + chieuRong)*2;
    }
    public double dienTich(){
        return chieuRong*chieuDai;
    }
    //Bo sung
    public String toString(){
        return String.format("HinhChuNhat[chieuDai=%.2f, chieuRong=%.2f]", chieuDai, chieuRong);
    }
}
