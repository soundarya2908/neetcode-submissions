class Solution {
    public boolean isAnagram(String s, String t) {
        char[] chs = s.toCharArray();
        Arrays.sort(chs);
        char[] cht = t.toCharArray();
        Arrays.sort(cht);

        String ss = new String(chs);
        String st = new String(cht);

        return ss.equals(st);
    }
}
