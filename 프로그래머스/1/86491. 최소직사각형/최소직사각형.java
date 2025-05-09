class Solution {
    public int solution(int[][] sizes) {
        int max_w = 0;
        int max_h = 0;
        
        for (int i = 0; i < sizes.length; i++) {
            int w = Math.max(sizes[i][0], sizes[i][1]);
            int h = Math.min(sizes[i][0], sizes[i][1]);
            
            max_w = Math.max(max_w, w);
            max_h = Math.max(max_h, h);
        }
        
        return max_w * max_h;
    }
}