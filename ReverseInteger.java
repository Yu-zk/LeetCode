public class ReverseInteger {
    public int reverse(int x) {
        long xx=Math.abs(x);
        long r=0;
        int n = (int) Math.log10(xx);
        for (int i = n; i >=0 ; i--) {
            r =r+ xx / ((int)Math.pow(10,i))*((int)Math.pow(10,n-i));
            xx = xx % (int)Math.pow(10,i);
        }
        if (x<0){
            r=-r;
        }
//        ensure in int
        if ((r>=2147483647)||(r<=-2147483648)){
            return 0;
        }
        return (int)r;
    }
    public static void main(String[] args) {
        ReverseInteger r = new ReverseInteger();
        System.out.println(r.reverse(123));
        System.out.println(r.reverse(-123));
        System.out.println(r.reverse(0));
        System.out.println(r.reverse(120));
        System.out.println(r.reverse(1534236469));
    }
}
