import java.util.*;

class Solution {
    public int solution(int[] array) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        
        //빈도 수 계산
        for (int num : array) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        
        //최빈값 찾기
        int maxCount = 0;
        int mode = -1;
        boolean isDuplicate = false;
        
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            int num = entry.getKey();
            int count = entry.getValue();
            
            if (count > maxCount) {
                maxCount = count;
                mode = num;
                isDuplicate = false; // 최빈값 갱신 시 중복여부 초기화
            } else if (count == maxCount) {
                isDuplicate = true; // 최빈값 중복
            }
         }
        
        return isDuplicate ? -1 : mode;
    }
}