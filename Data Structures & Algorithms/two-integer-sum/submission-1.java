class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> indexMap = new HashMap<>();
        int[] answer = new int[2];

        for (int i = 0; i < nums.length; i++) {
            if (indexMap.containsKey(target - nums[i])) {
                answer[0] = indexMap.get(target - nums[i]);
                answer[1] = i;
                return answer;
            }
            indexMap.put(nums[i], i);
        }
        return answer;
    }
}
