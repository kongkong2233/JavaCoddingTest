import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        //String a 하나씩 쪼개기
        char[] ch = a.toCharArray();
        
        //대소문자 구별(isUpperCase/isLowerCase) 및 변환(toUpperCase/toLowerCase)
        for (char c : ch) {
            if (Character.isUpperCase(c)) {
                c = Character.toLowerCase(c);
            } else {
                c = Character.toUpperCase(c);
            }
            System.out.print(c);
        }
    }
}