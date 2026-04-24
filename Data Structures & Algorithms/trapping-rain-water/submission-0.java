class Solution {
    public int trap(int[] height) {
        int answer = 0;
        int[] biggestTillNow = new int[height.length];
        int[] biggestFromNow = new int[height.length];
        biggestTillNow[0] = 0;
        biggestFromNow[height.length - 1] = 0;

        for (int i = 1; i < height.length; i++) {
            biggestTillNow[i] = Math.max(biggestTillNow[i - 1], height[i - 1]);
            biggestFromNow[height.length - 1 - i] = Math.max(biggestFromNow[height.length - 1 - i + 1], height[height.length - 1 - i + 1]);
        }

        for (int i = 0; i < height.length; i++) {
            if (Math.min(biggestTillNow[i], biggestFromNow[i]) - height[i] > 0) {
                answer += Math.min(biggestTillNow[i], biggestFromNow[i]) - height[i];
            }
        }

        return answer;

    }
}
