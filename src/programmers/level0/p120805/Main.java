package programmers.level0.p120805;

public class Main {
    public static void main(String[] args) {
    Solution sol = new Solution();
        System.out.println(sol.solution(10,5));

    }
}

class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        answer = num1 / num2;
        return answer;
    }
}