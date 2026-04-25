class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        List<List<String>> answer = new ArrayList<>();
        for (String str: strs) {
            char[] strChar = str.toCharArray();
            Arrays.sort(strChar);
            String sorted = new String(strChar);

            List<String> temp = new ArrayList<>();

            if (map.containsKey(sorted)) {
                temp = map.get(sorted);
            }
            temp.add(str);
            map.put(sorted, temp);

        }

        for (String str : map.keySet()) {
            answer.add(map.get(str));
        }

        return answer;

    }
}
