import java.util.HashSet;
import java.util.Set;
public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring1(String s) {
        int max=0;
        if (s.length()==1) return 1;
        for (int i = 0; i < s.length()-1; i++) {
            int n=1;
            String a=Character.toString(s.charAt(i));
            for (int j = i+1; j <s.length(); j++) {
                if (a.contains(Character.toString(s.charAt(j)))){
                    break;
                }else{
                    n++;
                    a=a+s.charAt(j);
                }
            }
            if (n>max) max=n;
        }
        return max;
    }
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int ans = 0, i = 0, j = 0;
        while (i < n && j < n) {
            // try to extend the range [i, j]
            if (!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            }
            else {
                set.remove(s.charAt(i++));
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        LongestSubstringWithoutRepeatingCharacters l =new LongestSubstringWithoutRepeatingCharacters();
        System.out.println(l.lengthOfLongestSubstring("abcabcbb"));
//        System.out.println(l.lengthOfLongestSubstring("bbbbb"));
//        System.out.println(l.lengthOfLongestSubstring("pwwkew"));
//        System.out.println(l.lengthOfLongestSubstring("aaaaaaaaaaaaaaabvc"));
//        System.out.println(l.lengthOfLongestSubstring("pwwgehgehkew"));
//        System.out.println(l.lengthOfLongestSubstring(""));
//        System.out.println(l.lengthOfLongestSubstring("b"));
    }
}
