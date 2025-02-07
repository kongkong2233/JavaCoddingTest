class Solution {
    public int solution(int balls, int share) {
        //Hint => balls = 20 / share = 5
        //answer = 20 * 19 * 18 * 17 * 16 / 5 * 4 * 3 * 2 * 1
        // if (share > balls / 2) {
        //     share = balls - share; // nCr => nC(n-r)
        // }
        long answer = 1;
        
        for (int i = 0; i < share; i++) {
            answer = answer * (balls - i) / (i + 1);
        }
        
        return (int)answer;
    }
}