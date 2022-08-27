// https://nados.io/question/largest-subarray-with-contiguous-elements
import java.util.*;

public class Main {

	public static int solution(int[] arr) {
		// write your code here

		return 0;
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] arr = new int[scn.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		System.out.println(solution(arr));
	}

}
