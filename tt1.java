//leetcode 3903 smallest stable index

public class tt1 {

        public static void main(String[] args) {

            int[] nums = {5, 0, 1, 4};
            int k = 3;

            Solution solution = new Solution();

            int result = solution.firstStableIndex(nums, k);

            System.out.println("First Stable Index: " + result);
        }
    }

    class Solution {

        public int firstStableIndex(int[] nums, int k) {

            for (int i = 0; i < nums.length; i++) {

                int max = nums[0];
                int min = nums[i];

                for (int j = 0; j <= i; j++) {

                    if (nums[j] > max) {
                        max = nums[j];
                    }
                }

                for (int j = i; j < nums.length; j++) {

                    if (nums[j] < min) {
                        min = nums[j];
                    }
                }

                int score = max - min;

                // Debug output
                System.out.println(
                        "i = " + i +
                                ", max = " + max +
                                ", min = " + min +
                                ", score = " + score
                );

                if (score <= k) {
                    return i;
                }
            }

            return -1;
        }
    }

