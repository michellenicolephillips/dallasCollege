import java.util.Arrays;

public class TwoSum {

     public static int[] twoSum (int[] nums, int target) {
          int[] solution = new int[2];
          for (int i = 0; i < nums.length; i++) {
               if (i + 1 < nums.length) {
                    for (int j = i + 1; j < nums.length; j++) {
                         if (nums[i] + nums[j] == target) {
                              solution[0] = nums[i];
                              solution[1] = nums[j];
                              return solution;
                         }
                    }
               }
          }
     return solution;
     }


     public static void main (String[] args) {
          int[] nums = {2,7,11,15,3,5};
          IO io = new IO();
          int target = io.getInput("Please enter the number you want to find a sum of:");
          int solution[] = twoSum(nums, target);
          System.out.println(Arrays.toString(solution));
     }
}
