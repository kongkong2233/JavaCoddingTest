class Solution {
    public int solution(String binomial) {
        int answer = 0;
        
        String[] strList = binomial.split(" ");
        int a = Integer.parseInt(strList[0]);
        int b = Integer.parseInt(strList[2]);
        
        switch (strList[1]) {
            case "+":
                answer = a + b;
                break;
            case "-":
                answer = a - b;
                break;
            case "*":
                answer = a * b;
                break;
            case "/":
                answer = a / b;
                break;
        }
        
        return answer;
    }
}