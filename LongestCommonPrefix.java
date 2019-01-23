public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String s="";
        if (strs.length==0) return "";
        for (int i = 0; i < strs[0].length(); i++) {
            char c=strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if ((i<strs[j].length() && strs[j].charAt(i)!=c) || i==strs[j].length()){
                    return s;
                }
            }
            s=s+c;
        }
        return s;
    }

    public static void main(String[] args) {
        LongestCommonPrefix l = new LongestCommonPrefix();
        String[] s = new String[2];
        s[0]="aa";
        s[1]="a";
//        s[2]="flight";
        System.out.println(l.longestCommonPrefix(s));
    }

}
