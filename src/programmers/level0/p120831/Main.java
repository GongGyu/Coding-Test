package programmers.level0.p120831;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(4));
    }
}
class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if(i % 2 == 0) {
                answer += i;
            }
        }

        return answer;
    }
}