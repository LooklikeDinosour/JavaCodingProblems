package chapter1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Problems1 {
    public static void main(String[] args) {

        //001 문자 개수 세기
        //문자만 세는 프로그램인가?
        Scanner scan = new Scanner(System.in);
        System.out.print("문장을 입력해주세요 : ");
        String sentence = scan.nextLine();
        Map<Character, Integer> countChar = new HashMap<>();
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);

            countChar.compute(ch, (key, value) -> (value == null) ? 1 : ++value);
        }
        System.out.println("문자의 개수 : " + countChar);
    }
}
