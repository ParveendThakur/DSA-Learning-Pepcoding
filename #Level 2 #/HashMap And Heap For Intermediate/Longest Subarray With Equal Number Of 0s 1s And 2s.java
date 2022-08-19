// https://nados.io/question/longest-subarray-with-equal-number-of-0s-1s-and-2s
import java.util.*;

public class Main {

    public static int solution(int[] arr) {
        // write your code here

        return 0;
    }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println(solution(arr));
    }

}
