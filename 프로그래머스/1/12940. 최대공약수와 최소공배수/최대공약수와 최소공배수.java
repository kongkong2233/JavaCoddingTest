class Solution {
    public int[] solution(int n, int m) {
        int originaln = n;
        int originalm = m;
        
        //최대공약수 (유클리드 호제법)
        while (m != 0) {
            int temp = m;
            m = n % m;
            n = temp;
        }
        
        int gcd = n;
        int lcm = originaln * originalm / gcd;
        
        int[] answer = {gcd, lcm};
        return answer;
    }
}