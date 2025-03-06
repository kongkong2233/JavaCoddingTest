class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        char ks = Character.forDigit(k, 10);
        
        for (int a = i; a <= j; a++) {
            String as = Integer.toString(a);
            
            for (char ch : as.toCharArray()) {
                if (ch == ks) answer++;
            }
        }
        
        return answer;
    }
}