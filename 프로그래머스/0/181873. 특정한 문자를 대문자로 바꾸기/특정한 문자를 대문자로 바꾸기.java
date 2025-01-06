class Solution {
    public String solution(String my_string, String alp) {
        char ch = alp.charAt(0);
        char upperCh = (char) (ch - 32);
        my_string = my_string.replace(alp, String.valueOf(upperCh));
        return my_string;
    }
}