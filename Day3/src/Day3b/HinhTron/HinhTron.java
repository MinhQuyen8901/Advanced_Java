package Day3b.HinhTron;

public class HinhTron {
    double banKinh;
    public HinhTron(double banKinh){
        this.banKinh = banKinh;
    }
    public double chuVi(){

        return 2*Math.PI*banKinh;
    }
    public double dienTich(){

        return 2*Math.PI*banKinh*banKinh;
    }
    public String toString(){
        return String.format("HinhTron[banKinh=%.2f]", banKinh);
    }
}
