class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] productLeft = new int[nums.length];
        int[] productRight = new int[nums.length];
        int[] answer = new int[nums.length];

        productLeft[0] = 1;
        productRight[nums.length - 1] = 1;

        for (int i = 1; i < nums.length; i++) {
            productLeft[i] = nums[i - 1] * productLeft[i - 1];
            productRight[nums.length - 1 - i] = nums[nums.length - i] * productRight[nums.length - i];
        }

        for (int i = 0; i < nums.length; i++) {
            answer[i] = productLeft[i] * productRight[i];
        }

        return answer;
    }
}  
