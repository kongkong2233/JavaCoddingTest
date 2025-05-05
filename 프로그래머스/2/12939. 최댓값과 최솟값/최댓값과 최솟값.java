class Solution {
    public String solution(String s) {
        String[] strNum = s.split(" ");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for (int i = 0; i < strNum.length; i++) {
            int num = Integer.parseInt(strNum[i]);
            
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        
        String answer = "";
        answer = min + " " + max;
        return answer;
    }
}