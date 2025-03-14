import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] num1 = {1, 2, 3, 4, 5};
        int[] num2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] num3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int[] score = new int[3];
        
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == num1[i % 5]) score[0]++;
            if (answers[i] == num2[i % 8]) score[1]++;
            if (answers[i] == num3[i % 10]) score[2]++;
        }
        
        int maxScore = Math.max(score[0], Math.max(score[1], score[2]));
        
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < 3; i++) {
            if (maxScore == score[i]) list.add(i + 1);
        }
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}