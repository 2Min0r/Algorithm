import java.util.*;

class Solution {
    public int solution(String s) {

        String[] digits = {"0","1","2","3","4","5","6","7","8","9"};
        String[] alphabets = {"zero","one","two","three","four","five","six","seven","eight","nine"};

        for (int i = 0; i< 10; i++) {
            s = s.replaceAll(alphabets[i],digits[i]);
        }

        return Integer.parseInt(s);
    }
}

/*
처음에 HashMap을 이용해서 풀었지만,
index와 replaceAll을 활용하는 방법이 더 가독성도 좋고 깔끔하고 효율이 좋은듯
*/
