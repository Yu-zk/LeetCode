public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        for (int i = 0; i < s.length()-1; i++) {
            int n=0;
            String a="";
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

    public static void main(String[] args) {
        LongestSubstringWithoutRepeatingCharacters l =new LongestSubstringWithoutRepeatingCharacters();
        System.out.println(l.lengthOfLongestSubstring("wertyuiopasdfghjkl"));
    }
}
