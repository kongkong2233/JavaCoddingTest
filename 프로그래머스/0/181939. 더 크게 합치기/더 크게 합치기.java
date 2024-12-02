class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String aText = Integer.toString(a);
        String bText = Integer.toString(b);
        
        String resultText1 = aText.concat(bText);
        String resultText2 = bText.concat(aText);
        
        int result1 = Integer.parseInt(resultText1);
        int result2 = Integer.parseInt(resultText2);
        
        if (result1 >= result2) {
            answer = result1;
        } else {
            answer = result2;
        }
        
        return answer;
    }
}