class Solution {
    public int lastStoneWeight(int[] stones) {
        Queue<Integer> queue = new PriorityQueue<>((a,b) -> b - a);

        for(int stone: stones) queue.add(stone);

        while(queue.size() > 1) {
            int stone1 = queue.poll();
            int stone2 = queue.poll();

            if (stone1 != stone2) {
                queue.add(stone1 - stone2);
            }
        }

        return queue.size() != 0 ? queue.poll() : 0;

    }
}
