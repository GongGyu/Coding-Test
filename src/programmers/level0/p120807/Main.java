package programmers.level0.p120807;

public class Main {
    public static void main(String[] args) {
    Solution sol = new Solution();
    }
}
class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        if (num1 == num2) {
            answer= 1;
        }else {
            answer = -1;
        }
        return answer;
    }
}
