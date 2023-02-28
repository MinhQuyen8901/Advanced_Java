package Day3_BTVN_lamThemVD;

public class NganHang {
    //Thuộc tính
    private long soTK;
    private String tenTK;
    private double soTienTrongTK;
    //Phương thức
    public NganHang(){}  // construction rỗng

    public NganHang(long soTK, String tenTK, double soTienTrongTK) {  // construction dđủ thông tin
        this.soTK = soTK;
        this.tenTK = tenTK;
        this.soTienTrongTK = soTienTrongTK;
    }

    public long getSoTK() {
        return soTK;
    }

    public void setSoTK(long soTK) {
        this.soTK = soTK;
    }

    public String getTenTK() {
        return tenTK;
    }

    public void setTenTK(String tenTK) {
        this.tenTK = tenTK;
    }

    public double getSoTienTrongTK() {
        return soTienTrongTK;
    }

    public void setSoTienTrongTK(double soTienTrongTK) {
        this.soTienTrongTK = soTienTrongTK;
    }

    @Override
    public String toString() {
        return "NganHang{" +
                "soTK=" + soTK +
                ", tenTK='" + tenTK + '\'' +
                ", soTienTrongTK=" + soTienTrongTK +
                '}';
    }
}
