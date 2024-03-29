//https://nados.io/question/coin-change-permutations
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

    }
}import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] coins = new int[n];
        for(int i = 0; i<n; i++){
            coins[i] = scn.nextInt();
        }
        int tar = scn.nextInt();

        int[] dp = new int [tar+1];
        dp[0] = 1;
        for (int i =1; i<=tar; i++){
            for(int j= 0; j<n; j++){
                int coin = coins[j];
                if(coin<=i){
                    dp[i] += dp[i-coin];
                }
            }
        }

        System.out.println(dp[tar]);

    }
}