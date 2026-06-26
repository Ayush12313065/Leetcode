class Solution {
    public double findMaxAverage(int[] nums, int k) {
        long currentsum =0;
        for(int i =0;i<k;i++){
            currentsum+= nums[i];
        }
        long maxsum = currentsum;
        for(int i =k;i<nums.length;i++){
            currentsum += nums[i] - nums[i-k];
            maxsum = Math.max(maxsum,currentsum);
        }
      

        return (double)maxsum/k;
    }
}