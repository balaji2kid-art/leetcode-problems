class Solution {
    public int maxSubArray(int[] nums) {
        int Sum1 = nums[0];
        int Sum2 = nums[0];

        for (int i = 1; i < nums.length; i++) {
            Sum1 = Math.max(nums[i], Sum1 + nums[i]);
            Sum2 = Math.max(Sum2,Sum1);
        }

        return Sum2;
    }
}