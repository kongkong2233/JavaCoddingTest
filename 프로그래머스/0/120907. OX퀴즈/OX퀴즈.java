class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for (int i = 0; i < quiz.length; i++) {
            String[] str = quiz[i].split(" ");
            
            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[2]);
            int result = Integer.parseInt(str[4]);
            
            if (str[1].equals("+")) {
                answer[i] = result == a + b ? "O" : "X";
            } else if (str[1].equals("-")) {
                answer[i] = result == a - b ? "O" : "X";
            }
        }
        
        return answer;
    }
}