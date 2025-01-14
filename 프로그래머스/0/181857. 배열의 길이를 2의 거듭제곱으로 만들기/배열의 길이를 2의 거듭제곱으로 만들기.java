import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer;
        int n = arr.length;
        
        if (n > 0 && (n & (n - 1)) == 0) { //비트 연산자를 통한 2거듭제곱 여부
            answer = arr.clone();
        } else {
            int newLength = 1;
            while (newLength < n) {
                newLength *= 2;
            }
            answer = new int[newLength];
            System.arraycopy(arr, 0, answer, 0, n); //나머지는 0으로 채워짐
        }
        
        return answer;
    }
}