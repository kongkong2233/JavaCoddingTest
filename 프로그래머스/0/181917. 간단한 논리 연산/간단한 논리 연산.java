class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = (x1||x2)&&(x3||x4);
//         boolean result1 = true;
//         boolean result2 = true;
        
//         if (x1 == false && x2 == false) {
//             result1 = false;
//         }
        
//         if (x3 == false && x4 == false) {
//             result2 = false;
//         }
        
//         if (result1 == false || result2 == false) {
//             answer = false;
//         }
        
        return answer;
    }
}