class Solution {
    public int missingNumber(int[] nums) {
        int sum=0;
        int n=nums.length+1;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
        }
        int m=n*(n-1)/2;
        int r=m-sum;
        return r;
        
    }
}