class Solution {
    public String solution(int age) {
        char[] alp = new char[10];
        
        for (int i = 0; i < 10; i++) {
            alp[i] = (char) (97 + i);
        }
        
        String answer = "";
        String[] ageStr = String.valueOf(age).split("");
        
        for (int i = 0; i < ageStr.length; i++) {
            int digit = Integer.parseInt(ageStr[i]);
            answer += alp[digit];
        }
        
        return answer;
    }
}