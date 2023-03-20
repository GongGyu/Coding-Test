package programmers.level0;

public class p120802 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(2,3));
    }
}
class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        answer = num1 * num2;
        return answer;
    }
}