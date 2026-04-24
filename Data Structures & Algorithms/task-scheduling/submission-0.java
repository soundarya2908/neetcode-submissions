class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] task = new int[26];

        for (char ch: tasks) task[ch - 'A']++;
        
        Arrays.sort(task);
        int max = task[25];

        int idle = (max - 1) * n;

        for (int i = 24; i >= 0; i--) {
            idle -= Math.min(max - 1, task[i]);
        }

        return idle < 0 ? tasks.length : tasks.length + idle;

    }
}
