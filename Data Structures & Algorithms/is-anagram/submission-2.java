class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Character,Integer> map = new HashMap<>();

        for (char i : s.toCharArray()) {
            map.putIfAbsent(i, 0);
            map.put(i, map.get(i) + 1);
        }

        for (char i : t.toCharArray()) {
            if (!map.containsKey(i)) return false;
            map.put(i, map.get(i) - 1);
            if (map.get(i) == 0) {
                map.remove(i);
            }
        }

        return map.isEmpty();
    }
}
