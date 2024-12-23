class Solution {
    public String solution(String my_string, int[] indices) {
        char[] ch = my_string.toCharArray();
        boolean[] bool = new boolean[ch.length];
        
        for (int index : indices) {
            if (index >= 0 && index < ch.length) {
                bool[index] = true;
            }
        }
        
        String answer = "";
        for (int i = 0; i < ch.length; i++) {
            if (!bool[i]) {
                answer += ch[i];
            }
        }
        
        return answer;
    }
}