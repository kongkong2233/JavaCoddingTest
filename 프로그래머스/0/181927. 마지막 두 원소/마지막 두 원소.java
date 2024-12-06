import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        
        //리스트로 변환
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int num : num_list) {
            arrayList.add(num);
        }
        
        int lastIdx = num_list.length - 1;
        int addInt = 0;
        
        if (num_list[lastIdx] > num_list[lastIdx - 1]) {
            addInt = num_list[lastIdx] - num_list[lastIdx - 1];
            arrayList.add(addInt);
        } else {
            addInt = num_list[lastIdx] * 2;
            arrayList.add(addInt);
        }
        
        //리스트 배열로 전환
        int[] answer = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            answer[i] = arrayList.get(i);
        }
        
        return answer;
    }
}