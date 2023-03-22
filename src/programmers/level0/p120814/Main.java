package programmers.level0.p120814;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
    }
}

class Solution {
    public int solution(int n) {
        int answer = 0;
        if(n <= 7) {
            answer = 1;
        }else if(n > 7) {
            answer = ( n / 7) + 1;
        }
        return answer;
    }
}