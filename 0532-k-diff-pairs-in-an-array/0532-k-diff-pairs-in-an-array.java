
class Solution {
    public int findPairs(int[] nums, int k) {

        if (k < 0) {
            return 0;
        }

        int count = 0;

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {

         
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            for (int j = i + 1; j < nums.length; j++) {

                if (nums[j] - nums[i] == k) {
                    count++;
                    break;
                }

              
                if (nums[j] - nums[i] > k) {
                    break;
                }
            }
        }

        return count;
    }
}

