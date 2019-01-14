import java.util.HashMap;
import java.util.Map;
public class TwoSum {
    public int[] twoSum1(int[] nums, int target) {
        int[] r = new int[2];
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j <nums.length; j++) {
                if (nums[i]+nums[j]==target){
                    r[0]=i;
                    r[1]=j;
                    return r;
                }
            }
        }
        return r;
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        return new int[] {0,1};
    }

    public static void main(String[] args) {
        TwoSum s = new TwoSum();

        int[] nums=new int[4];
        nums[0]=2;
        nums[1]=7;
        nums[2]=11;
        nums[3]=15;

        for (int i : s.twoSum(nums,13)){
            System.out.println(i);
        }
    }
}
