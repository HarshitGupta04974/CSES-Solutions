import java.util.Arrays;
import java.util.Scanner;

public class DiceCombinations {
    static int mod=(int)1e9+7;
//    private static int func(int n,int dp[])
//    {
//        if(n<0) return 0;
//        if(n==0)
//        {
//            return 1;
//        }
//        if(dp[n]!=-1) return dp[n];
//        int count=0;
//        for(int i=6;i>=1;i--)
//        {
//            count+=func(n-i,dp)%mod;
//        }
//        return dp[n]=count%mod;
//    }
    private static int tab(int n)
    {
        int dp[]=new int[n+1];
        dp[0]=1;
        for(int i=0;i<=n;i++)
        {   for(int dice=1;dice<=6;dice++) {
            if(i+dice<=n)
            {
                dp[i+dice]=( dp[i+dice]+dp[i])%mod;
            }

            }
        }
        return dp[n];
    }
    public static void main(String args[])
    {   Scanner kb=new Scanner(System.in);
        int n=kb.nextInt();
//        int dp[]=new int[n+1];
//        Arrays.fill(dp,-1);
        int ans=tab(n);
        System.out.println(ans);
    }
}
