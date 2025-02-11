class Solution {
    public int solution(int n) {
        int i = 1;
        
        while (factorial(i) <= n) {
            i++;
        }
        
        return i - 1;
    }
    
    static int factorial(int i) {
        if (i == 1) {
            return 1;
        }
        return i * factorial(i - 1);
    }
}