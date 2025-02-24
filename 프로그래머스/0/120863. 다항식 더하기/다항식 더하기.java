class Solution {
    public String solution(String polynomial) {
        String[] arr = polynomial.split(" ");
        
        int xNum = 0;
        int num = 0;
        
        for (int i = 0; i < arr.length; i+= 2) {
            if (arr[i].contains("x")) {
                if (arr[i].equals("x")) {
                    xNum += 1;
                } else {
                    xNum += Integer.parseInt(arr[i].replace("x", ""));
                }
            } else {
                num += Integer.parseInt(arr[i]);
            }
        }
        
        String answer = "";
        
        if (xNum > 0) answer += (xNum == 1 ? "x" : xNum + "x");
        if (num > 0) answer += (xNum > 0 ? " + " : "") + num;
        
        return answer;
    }
}