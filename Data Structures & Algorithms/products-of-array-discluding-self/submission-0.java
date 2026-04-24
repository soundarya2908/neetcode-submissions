class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] productLeft = new int[nums.length];
        int[] productRight = new int[nums.length];
        int[] answer = new int[nums.length];

        productLeft[0] = 1;
        productRight[nums.length - 1] = 1;

        for (int i = 1; i < nums.length; i++) {
            productLeft[i] = nums[i - 1] * productLeft[i - 1];

            productRight[nums.length - 1 - i] = nums[nums.length - 1 - i + 1] * productRight[nums.length - 1 - i + 1];
        }

        for (int i = 0; i < nums.length; i++) {
            answer[i] = productRight[i] * productLeft[i];
        }

        return answer;
    }

    //[1,1,2,8]
    //[1,2,8,48]

    //[48,24,6,1]
    //[48,48,24,6]
}  
