import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int[] sortArr = new int[rank.length];
        for (int i = 0; i < rank.length; i++) {
            if (attendance[i]) {
                sortArr[i] = rank[i];
            } else {
                rank[i] = Integer.MAX_VALUE;
            }
        }
        
        Arrays.sort(rank);
        
        int answer = 0;
        
        for (int i = 0; i < rank.length; i++) {
            if (rank[0] == sortArr[i]) {
                answer += i * 10000;
            } else if (rank[1] == sortArr[i]) {
                answer += i * 100;
            } else if (rank[2] == sortArr[i]) {
                answer += i;
            }
        }
        
        return answer;
    }
}