class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int[][] answer = new int[k][2];
        Queue<int[]> pq = new PriorityQueue<>((a, b) -> (a[0] * a[0] + a[1] * a[1]) - (b[0] * b[0] + b[1] * b[1]));

        for (int[] point : points) {
            System.out.println(point[0]);
            System.out.println(point[1]);
            pq.add(point);
        }

        for (int i = 0; i < k; i++) {
            answer[i] = pq.poll();
            // System.out.println(answer[i][0]);
            // System.out.println(answer[i][1]);
        }
        return answer;
    }
}
