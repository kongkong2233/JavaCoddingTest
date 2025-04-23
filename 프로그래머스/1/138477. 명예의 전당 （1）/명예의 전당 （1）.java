import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> rank = new ArrayList<>();
        
        for (int i = 0; i < score.length; i++) {
            rank.add(score[i]);
            
            if (rank.size() > k) {
                rank.remove(Collections.min(rank)); //리스트 내 최하위 값 삭제
            }
            
            answer[i] = Collections.min(rank); //리스트 내 최하위 값 answer에 넣기
        }
        
        return answer;
    }
}