class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        int i=0;
        int j=0;

        while(j<nums.length){
            if(i<k|| nums[j]!=nums[i-k]){
                nums[i]=nums[j];
                i++;
            }
            j++;
        }
        return java.util.Arrays.copyOf(nums, i);


    }
}