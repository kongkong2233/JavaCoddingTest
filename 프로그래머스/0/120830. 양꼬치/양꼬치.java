class Solution {
    public int solution(int n, int k) {
        int s = n >= 10 ? n / 10 : 0;

        return n * 12000 + (k - s) * 2000;
    }
}