package programmers.level0.p120811;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] array = {1, 2, 7, 10, 11};
        System.out.println(array);
        System.out.println(array.length);
        System.out.println(solution.solution(array));
    }
}
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        Arrays.sort(array);
        return array[array.length / 2];
    }
}