class Solution {
    public String solution(String my_string, String alp) {
        String a = alp.toUpperCase();
        my_string = my_string.replace(alp, a);
        return my_string;
    }
}