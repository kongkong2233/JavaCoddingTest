class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        
        for (int i = 0; i < queries.length; i++) {
            int a = queries[i][0];
            int b = queries[i][1];
            int c = queries[i][2];
            
            int minValue = Integer.MAX_VALUE;
            
            for (int j = 0; j < arr.length; j++) {
                if (j >= a && j <= b && arr[j] > c) {
                    minValue = Math.min(minValue, arr[j]);
                }
            }
            
            answer[i] = (minValue == Integer.MAX_VALUE) ? -1 : minValue;
        }
        
        return answer;
    }
}