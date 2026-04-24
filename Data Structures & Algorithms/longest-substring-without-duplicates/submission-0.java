class Solution {
    public int lengthOfLongestSubstring(String s) {
        int count = 0;
        Set<Character> set = new HashSet<>();
        int j = 0;

        for (int i = 0; i < s.length();) {
            if (!set.contains(s.charAt(i))) {
                set.add(s.charAt(i));
                count = Math.max(count, set.size());
                i++;
            } else{
                set.remove(s.charAt(j));
                j++;
            }
        }

        return count;
    }
}
