package programmers.level0.p120585;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] array = {149, 180, 192, 170};
        System.out.println(solution.solution(array, 167));
    }
}
class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] > height) {
                answer += 1;
            }
        }
        return answer;
    }
}