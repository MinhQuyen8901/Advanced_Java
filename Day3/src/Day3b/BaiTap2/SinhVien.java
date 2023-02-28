package Day3b.BaiTap2;

public class SinhVien {
    //Thuộc tính
    private int maSV;
    private String hoVaTen;
    private float diemLT;
    private  float diemTH;
    //Phương thức
    public SinhVien(){  //construction rỗng

    }
    public SinhVien(int maSV, String hoVaTen, float diemLT, float diemTH) {  //construction đầy đủ thông tin
        this.maSV = maSV;
        this.hoVaTen = hoVaTen;
        this.diemLT = diemLT;
        this.diemTH = diemTH;
        if(diemLT<0 && diemTH<0){
            System.out.println("Điểm không hợp lệ");
            return;
        }
    }

    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public float getDiemLT() {
        return diemLT;
    }

    public void setDiemLT(float diemLT) {
        if(diemLT<0){
            System.out.println("Điểm không hợp lệ");
            return;
        }
        this.diemLT = diemLT;
    }

    public float getDiemTH() {
        return diemTH;
    }

    public void setDiemTH(float diemTH) {
        if(diemTH<0) {
            System.out.println("Điểm không hợp lệ");
            return;
        }
            this.diemTH = diemTH;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "maSV=" + maSV +
                ", hoVaTen='" + hoVaTen + '\'' +
                ", diemLT=" + diemLT +
                ", diemTH=" + diemTH +
                ", diemTB=" + diemTB() +
                '}';
    }
    public double diemTB(){
        return (diemTH+diemLT)/2;
    }
}
