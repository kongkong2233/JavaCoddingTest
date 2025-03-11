import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int max = nums.length / 2;
        HashSet<Integer> set = new HashSet<>();
        
        for (int num : nums) {
            set.add(num); //중복 제거
        }
        
        int size = set.size();
        
        return size >= max ? max : size;
    }
}