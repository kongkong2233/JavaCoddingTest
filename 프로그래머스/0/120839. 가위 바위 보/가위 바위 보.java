class Solution {
    public String solution(String rsp) {
        String[] top = rsp.split("");
        String answer = "";
        
        for (int i = 0; i < top.length; i++) {
            if (top[i].equals("2")) {
                answer += "0";
            } else if (top[i].equals("0")) {
                answer += "5";
            } else {
                answer += "2";
            }
        }
        
        return answer;
    }
}