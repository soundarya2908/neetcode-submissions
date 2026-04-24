class Solution {
    public int longestConsecutive(int[] nums) {
        int maxCount = 0;
        int count = 0;
        Set<Integer> set = new HashSet<>();
        for (int num: nums) set.add(num);

        for (int num: nums) {
            if (!set.contains(num - 1)) { 
                count = 1;
                while (set.contains(num + count)) count++;

                maxCount = Math.max(maxCount, count);
            }        }

        return maxCount;
    }
}
