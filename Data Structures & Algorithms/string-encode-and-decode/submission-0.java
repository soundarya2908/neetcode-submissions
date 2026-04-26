class Solution {

    public String encode(List<String> strs) {
        List<String> temp = new ArrayList<>();
        for (String each: strs) {

            char[] charArr = each.toCharArray();

            for (int i = 0; i < charArr.length; i++) {
                charArr[i] = (char)(charArr[i] + 2);
            }

            StringBuilder sb = new StringBuilder();
            sb.append(charArr.length);
            sb.append("#");
            sb.append(charArr);

            temp.add(sb.toString());
        }
        StringBuilder sbAgain = new StringBuilder();
        for (String s : temp) {
            sbAgain.append(s);
        }

        return sbAgain.toString();
    }

    public List<String> decode(String str) {
        int i = 0;
        int start = 0;
        List<String> answer = new ArrayList<>();

        while (i < str.length()) {
            while(str.charAt(i) != '#') i++;
            int length = Integer.parseInt(str.substring(start, i));
            String word = str.substring(i + 1, i + 1 + length);
            char[] charArr = word.toCharArray();

            for (int j = 0; j < charArr.length; j++) {
                charArr[j] = (char)(charArr[j] - 2);
            }
            word = new String(charArr);
            answer.add(word);
            start = i + 1 + length;
            i = i + 1 + length;
        }
        return answer;
    }
}

// ["Jgnnq","Yqtnf"] 
// "5#Jgnnq5#Yqtnf"


// ["Jgnnq","Yqtnf"] 
