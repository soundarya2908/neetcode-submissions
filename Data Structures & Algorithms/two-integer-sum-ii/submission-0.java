class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0; 
        int j = numbers.length - 1;
        int[] answer = new int[2];

        while(i < j) {
            int temp = numbers[i] + numbers[j];
            if (temp == target) {
                answer[0] = i + 1;
                answer[1] = j + 1;
                return answer;
            } else if (temp < target) {
                i++;
            } else {
                j--;
            }
        }

        return answer;
    }
}
