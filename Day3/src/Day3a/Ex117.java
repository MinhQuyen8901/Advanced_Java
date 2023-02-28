package Day3a;

public class Ex117 {
    // 117. S(n) = 𝑥 + 𝑥^2 + 𝑥^3 + ⋯ + 𝑥^𝑛
    //Hàm luy thừa a^b
    public static double pow(double a, int b){
        int _b = Math.abs(b); // TRị tuyệt đối của b
        double rs = 1;
        for(int i=0; i<_b; i++){
            rs = rs * a;
        }
        if(b<0)return 1/rs;
        return rs;
    }
    public static double sn(double x, double n){
        if(n<=0){
            return -1;
        }
        double t = 0;
        for (int i=1; i<=n; i++){
            t = t + pow(x,i);
        }
        return t;
    }
    public static void main(String[] args) {
        System.out.println(sn(2,2));
        System.out.println(sn(1,2));
        System.out.println(sn(2,-2));
    }
}
