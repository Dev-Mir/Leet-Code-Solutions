import java.lang.Math;

class Solution {

    public int[] twoSum(int[] nums, int target) {

        // initializing array
        int[] res = new int[2];
      
      // constraints for target
        double t1c = Math.pow(-target, 9);
        double t2c = Math.pow(target, 9);

      // checking valid conditionals
        if ((nums.length >= 2 || nums.length <= 10000) || (target >= t1c && target <= t2c)) {

            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {

                    if (nums[i] + nums[j] == target) {
                        res[0] = j;
                        res[1] = i;
                    }
                }
            }
        }

      // result
        return res;

    }
}

public class TwoSum{

    public static void main(String args[]) {

        Solution s = new Solution();

        int[] arr = { 2,7,11,15 };
        int[] r = s.twoSum(arr, 9);

        System.out.print("[");

        for (int i = 0; i < r.length; i++) {
            System.out.print(" " + r[i] + " ");
        }
        System.out.print("]");

    }
}
