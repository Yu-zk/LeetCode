public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x<0) return false;
        int n = x;
        long temp = 0;
        int pop = 0;

        while (n != 0) {
            pop = n % 10;
            n /= 10;
            temp = (long)(temp * 10 + pop);
        }

        if ((int)temp == x) {
            return true;
        } else
            return false;
    }
    public static void main(String[] args) {
        PalindromeNumber p = new PalindromeNumber();
        System.out.println(p.isPalindrome(12321));
        System.out.println(p.isPalindrome(1000021));
        System.out.println(p.isPalindrome(-121));
        System.out.println(p.isPalindrome(0));
        System.out.println(p.isPalindrome(1));
        System.out.println(p.isPalindrome(1221));
    }
}
