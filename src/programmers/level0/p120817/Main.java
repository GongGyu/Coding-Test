package programmers.level0.p120817;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

    }
}
class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
          sum += numbers[i];
        }
        answer = (double) sum / numbers.length;
        return answer;
    }
}
