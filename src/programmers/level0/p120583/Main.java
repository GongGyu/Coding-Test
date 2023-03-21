package programmers.level0.p120583;

public class Main {
    public static void main(String[] args) {
    Solution solution = new Solution();
    }
}

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == n) {
                answer += 1;

            }
        }
            return answer;
    }
}