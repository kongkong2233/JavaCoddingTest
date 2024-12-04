class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = 0;
        String ret = "";
        char[] codeCh = code.toCharArray();
        
        for (int i = 0; i < codeCh.length; i++) {
            if (mode == 0) {
                if (codeCh[i] == '1') {
                    mode = 1;
                } else {
                    if (i % 2 == 0) {
                        ret = ret + codeCh[i];
                    }
                }
            } else if (mode == 1) {
                if (codeCh[i] == '1') {
                    mode = 0;
                } else {
                    if (i % 2 != 0) {
                        ret = ret + codeCh[i];
                    }
                }
            }
        }
        
        if (ret.length() == 0) {
            answer = "EMPTY";
        } else {
            answer = ret;
        }
        
        return answer;
    }
}