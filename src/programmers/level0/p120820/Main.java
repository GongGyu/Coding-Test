package programmers.level0.p120820;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

    }
}

class Solution {
    public int solution(int age) {
        int answer = 0;
        answer = 2022 - age + 1;
        return answer;
    }
}