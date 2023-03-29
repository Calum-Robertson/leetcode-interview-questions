import java.util.Arrays;

public class MySolution {

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; true; j++) {
                if(i == j){
                    break;
                } else if (nums[i] + nums[j] == target){
                    return new int[]{j, i};
                }
            }
        }
        return null;
    }

    public static void main(String[] args){
        int target = 7;
        int[] nums = new int[]{5, 3, 4, 5};
        int[] output = twoSum(nums, target);
        System.out.println(Arrays.toString(output));
    }
}
