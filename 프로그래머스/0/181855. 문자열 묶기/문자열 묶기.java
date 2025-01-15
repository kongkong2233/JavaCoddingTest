import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        int[] num = new int[strArr.length];
        
        for (int i = 0; i < strArr.length; i++) {
            num[i] = strArr[i].length();
        }
        
        Arrays.sort(num);
        
        //빈도 수 체크
        int currentFq = 1;
        int maxFq = 1;
        int answer = num[0];
        
        for (int i = 1; i < num.length; i++) {
            if (num[i] == num[i - 1]) {
                currentFq++; //동일한 값 빈도 수 증가
            } else {
                if (currentFq > maxFq) {
                    maxFq = currentFq;
                    answer = maxFq;
                }
                currentFq = 1; //초기화
            }
        }
        
        if (currentFq > maxFq) {
            answer = currentFq;
        }
        
        return answer;
    }
}