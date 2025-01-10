class Solution {
    public int[] solution(int[] arr) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            index += arr[i];
        }
        
        int[] answer = new int[index];
        
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i]; j++) {
                answer[idx++] = arr[i];
            }
        }
        
        return answer;
    }
}