import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class BestSolution {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        // In case there is no solution, we'll just return null
        return null;
    }

    public static void main(String[] args){
        int target = 7;
        int[] nums = new int[]{5, 3, 4, 5};
        int[] output = twoSum(nums, target);
        System.out.println(Arrays.toString(output));
    }
}
