import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class DistinctNumbers {
    public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int arr[]=new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++)
        {
            arr[i]=Integer.parseInt(st.nextToken());
        }
        HashSet<Integer> set=new HashSet<>();
        for(int i:arr)
            set.add(i);

        System.out.println(set.size());
    }
    }
