class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        char[] chList = myString.toCharArray();
        
        for (int i = 0; i < chList.length; i++) {
            if (chList[i] == 'A') {
                chList[i] = 'B';
            } else if (chList[i] == 'B') {
                chList[i] = 'A';
            }
        }
        
        String strs = new String(chList);
        
        if (strs.contains(pat)) {
            answer = 1;
        }
        
        return answer;
    }
}