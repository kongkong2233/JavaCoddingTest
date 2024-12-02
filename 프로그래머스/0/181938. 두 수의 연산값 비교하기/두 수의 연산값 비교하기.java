class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String aText = Integer.toString(a);
        String bText = Integer.toString(b);
        
        String resultText = aText.concat(bText);
        
        int result1 = Integer.parseInt(resultText);
        int result2 = 2 * a * b;
        
        if (result1 >= result2) {
            answer = result1;
        } else {
            answer = result2;
        }
        
        return answer;
    }
}