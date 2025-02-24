class Solution {
    public int solution(int num, int k) {
        String str = String.valueOf(num);
        int[] arr = new int[str.length()];
        
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i) - '0'; 
        }
        
        int answer = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                answer = i + 1;
                break;
            }
        }
        
        return answer != 0 ? answer : -1;
    }
}