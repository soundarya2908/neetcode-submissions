class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramMap = new HashMap<>();
        List<List<String>> answer = new ArrayList<>();

        for (String str: strs) {
            char[] strCharArr = str.toCharArray();
            Arrays.sort(strCharArr);
            String sortedStr = new String(strCharArr);

            anagramMap.putIfAbsent(sortedStr, new ArrayList<>());
            List<String> tempArr = anagramMap.get(sortedStr);
            tempArr.add(str);
            anagramMap.put(sortedStr, tempArr);
        }

        for (String str : anagramMap.keySet()) {
            List<String> eachAnagram = anagramMap.get(str);
            answer.add(eachAnagram);
        }

        return answer;
        
    }
}
