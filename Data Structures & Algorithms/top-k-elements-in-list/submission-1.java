class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        } 

        Queue<Integer> queue = new PriorityQueue<>((a,b) -> map.get(b) - map.get(a));
        int[] answer = new int[k];

        queue.addAll(map.keySet());

        for (int i = 0; i < k; i++) {
            answer[i] = queue.poll();
        }
        return answer;
    }
}
