class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int[] checkNum = new int[10];

        for (int num : numbers) {
            checkNum[num] = 1;
        }

        for (int i=0; i < checkNum.length; i++) {
            if (checkNum[i] != 1) {
                answer += i;
            }
        }

        return answer;
    }
}


class Solution {
    public int solution(int[] numbers) {
        int answer = 45;

        for (int num : numbers) {
            answer -= num;
        }

        return answer;
    }
}