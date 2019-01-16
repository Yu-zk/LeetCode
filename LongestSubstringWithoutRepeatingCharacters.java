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
        int n = s.length(), ans = 0;
        int[] index = new int[128]; // current index of character
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++) {
            i = Math.max(index[s.charAt(j)], i);
            ans = Math.max(ans, j - i + 1);
            index[s.charAt(j)] = j + 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        LongestSubstringWithoutRepeatingCharacters l =new LongestSubstringWithoutRepeatingCharacters();
        System.out.println(l.lengthOfLongestSubstring("abcabcbb"));
        System.out.println(l.lengthOfLongestSubstring("bbbbb"));
        System.out.println(l.lengthOfLongestSubstring("pwwkew"));
        System.out.println(l.lengthOfLongestSubstring("aaaaaaaaaaaaaaabvc"));
        System.out.println(l.lengthOfLongestSubstring("pwwgehgehkew"));
        System.out.println(l.lengthOfLongestSubstring(""));
        System.out.println(l.lengthOfLongestSubstring("b"));
    }
}
