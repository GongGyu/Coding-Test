package programmers.level0.p120821;

public class Main {
    public static void main(String[] args) {
    Solution solution = new Solution();
    int[] num_list = {1,2,3,4,5};
        System.out.println(solution.solution(num_list));

    }
}


    class Solution {
public int[] solution(int[] num_list) {
        int[] reverse = new int[num_list.length];
        for(int i=0; i<=num_list.length-1; i++) {
            reverse[i] = num_list[num_list.length-1-i];
                }
            return reverse;
                 }
}