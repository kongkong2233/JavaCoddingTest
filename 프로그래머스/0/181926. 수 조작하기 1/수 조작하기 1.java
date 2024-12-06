class Solution {
    public int solution(int n, String control) {
        int answer = 0;
        
        char[] controlCh = control.toCharArray();
        
        for (char ch : controlCh) {
            switch (ch) {
                case 'w':
                    n += 1;
                    break;
                case 's':
                    n -= 1;
                    break;
                case 'd':
                    n += 10;
                    break;
                case 'a':
                    n -= 10;
                    break;
            }
        }
        
        answer = n;
        
        return answer;
    }
}