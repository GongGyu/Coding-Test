package programmers.level0.p120841;

public class Main {
    public static void main(String[] args) {

    }
}
class Solution {
    public int solution(int[] dot) {
        int answer = 0;
        if(dot[0] > 0 && dot[1] > 1 ) {
            answer = 1;
        }else if (dot[0] < 0 && dot[1] > 0) {
            answer = 2;
        }else if(dot [0] < 0 && dot[1] < 0) {
            answer = 3;
        }else {
            answer = 4;
        }
        return answer;
    }
}