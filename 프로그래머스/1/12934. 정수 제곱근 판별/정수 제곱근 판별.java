class Solution {
    public long solution(long n) {       
        double a = Math.sqrt(n);
        
        if (a == (long) a) {
            return (long) Math.pow(a + 1, 2);   
        }
        
        return -1;
    }
}