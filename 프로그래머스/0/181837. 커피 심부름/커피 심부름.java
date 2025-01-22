class Solution {
    public int solution(String[] order) {
        int ame = 0;
        int cafe = 0;
        
        for (int i = 0; i < order.length; i++) {
            if (order[i].contains("americano")) {
                ame++;
            } else if (order[i].contains("cafelatte")) {
                cafe++;
            } else {
                ame++;
            }
        }
        
        int answer = ame * 4500 + cafe * 5000;
        return answer;
        
    }
}