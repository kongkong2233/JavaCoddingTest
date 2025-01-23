import java.util.*;

class Solution {
    public String[] solution(String[] picture, int k) {
        List<String> list = new ArrayList<>();
        
        for (int i = 0; i < picture.length; i++) {
            String[] one = picture[i].split(""); //문자열 picture를 한 글자씩 나눠서 배열에 넣기
            String str = ""; //추가된 문자열 넣을 공간
            for (int j = 0; j < one.length; j++) {
                str += one[j].repeat(k); //배열하나 k번씩 반복한 것을 str에 추가
            }
            for (int j = 0; j < k; j++) {
                list.add(str); //위 과정으로 만들어진 str을 k만큼 list에 추가
            }
        }
        
        return list.toArray(new String[list.size()]);
    }
}