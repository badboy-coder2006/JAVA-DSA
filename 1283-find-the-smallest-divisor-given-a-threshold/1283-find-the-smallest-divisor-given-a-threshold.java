class Solution {
    public int smallestDivisor(int[] nums, int threshold) {

        int i = 1;
        int j = 0;

        for(int num:nums){
            j = Math.max(j,num);

        }

        int ans = j;
        while(i<=j){
            int mid = i+(j-i)/2;

            int sum = 0;
            for(int num:nums){
                sum += (num+mid-1)/mid;
            }
            if(sum<=threshold){
                ans = mid;
                j = mid-1;
            }else{
                i=mid+1;
            }
        }

        return ans;

        
    }
}