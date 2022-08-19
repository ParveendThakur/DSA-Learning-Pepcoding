// https://nados.io/question/count-of-subarrays-with-sum-divisible-by-k
import java.util.*;

public class Main {

    public static int solution(int[] arr, int k) {
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
        int k = scn.nextInt();
        System.out.println(solution(arr, k));
    }

}
