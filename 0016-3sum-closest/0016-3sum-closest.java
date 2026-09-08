class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int closest_sum = nums[0] + nums[1] +nums[2];
        for(int i =0 ;i < n - 2 ;i++){
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int left = i+1;
            int right = n -1;

            while(left < right){
                int currentsum = nums[i] + nums[left] + nums[right];
                if(currentsum == target) return currentsum;

                if(Math.abs(currentsum - target) < Math.abs(closest_sum - target)){
                    closest_sum = currentsum;
                }

                if(currentsum < target){
                    left ++;
                }
                else{
                    right--;
                }
            }
        }
        return closest_sum;
}
}