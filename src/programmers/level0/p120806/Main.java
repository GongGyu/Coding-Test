package programmers.level0.p120806;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(3,2));
    }
}

class Solution {
    public int solution(int num1, int num2) {

        return (int)(((float)num1 / (float)num2) * 1000);
    }
}