class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];

        int sameCount = 0;
        int zeroCount = 0;

        // lottos 내의 최고 순위 찾기
        for(int i: lottos){
            for(int j : win_nums) {
                if (j == i) sameCount++;
            }
            if(i == 0) zeroCount++;
        };

        // 0이 모두 틀릴 경우 (최저), 0이 모두 맞을 경우 (최고)
        int minRank = 7-correct;
        int maxRank = 7-correct-zero;

        if (minRank > 6) minRank = 6;
        if (maxRank > 6) maxRank = 6;

        return new int[] {maxRank, minRank};
    }
}