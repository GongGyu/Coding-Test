package programmers.level0.p120830;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(10,3));
    }
}

class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int num = n / 10;
        answer = (n * 12000) + ((k - num) * 2000);
        return answer;
    }
}