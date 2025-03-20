class Solution {
    public String solution(String s) {
        String answer = "";
        int idx = s.length() / 2;
        
        if (s.length() % 2 == 0) {
            return String.valueOf(s.charAt(idx - 1)) + s.charAt(idx);
        } else {
            return String.valueOf(s.charAt(idx));
        }
    }
}