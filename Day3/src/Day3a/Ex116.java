package Day3a;

public class Ex116 {
    //116. S(n)=1+2+...+n
    //Input:
    //Nếu không hợp lệ -> output: -1
    public static long tongS(int n){
        if(n<0){
            return -1;
        }
        long t=0;
        for(int i=1; i<=n; i++){
            t = t + i;
        }
        //System.out.println(t);    Lưu ý: không nên in
        return t;
    }
    public static void main(String[] args) {
        System.out.println(tongS(10));

    }
}
