import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int[] nextArr = new int[arr.length];
        
        while(true) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 50 && arr[i] % 2 == 0) {
                    nextArr[i] = arr[i] / 2;
                } else if (arr[i] < 50 && arr[i] % 2 != 0) {
                    nextArr[i] = arr[i] * 2 + 1;
                } else {
                    nextArr[i] = arr[i];
                }
            }
            
            if (Arrays.equals(nextArr, arr))
                break;
            
            arr = nextArr.clone();
            answer++;
        }
        
        return answer;
    }
}