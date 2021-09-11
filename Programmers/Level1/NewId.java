class Solution {
    public String solution(String new_id) {
        String answer = "";

        //Step 1
        answer = new_id.toLowerCase();

        //Step 2
        answer = answer.replaceAll("[^a-z0-9-_.]", "");

        //Step 3
        answer = answer.replaceAll("[.]+", ".");

        //Step 4
        answer = answer.replaceAll("^[.]|[.]$", "");

        //Step 5,6,7
        while (answer.length() < 3 || answer.length() > 15) {
            int len = answer.length();
            if (len == 0) answer= answer+"a";
            else if (len < 3) answer = answer+answer.substring(len-1);
            else if (len > 15) {
                answer = answer.substring(0, 15);
                answer = answer.replaceAll("^[.]|[.]$", "");
            }
        }

        return answer;
    }
}