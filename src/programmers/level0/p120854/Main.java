package programmers.level0.p120854;

public class Main {
    public static void main(String[] args) {

    }
}

class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        for(int i = 0; i < strlist.length; i++ ) {
            answer[i] = strlist[i].length();
        }

        return answer;
    }
}