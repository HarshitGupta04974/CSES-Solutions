import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class Counting_Rooms {
    static int n, m;
    static char[][] graph;
    static boolean[][] vis;

    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};

    private static void bfs(int x,int y)
    {
        Queue<int[]> q=new LinkedList<>();
        q.offer(new int[]{x,y});
        vis[x][y]=true;
        while(!q.isEmpty())
        {
            int temp[]=q.poll();
            int sr=temp[0];
            int sc=temp[1];

            for(int i=0;i<4;i++)
            {
                int dx=sr+dr[i];
                int dy=sc+dc[i];
                if(dx<n&&dx>=0&&dy<m&&dy>=0&&graph[dx][dy]=='.'&&!vis[dx][dy])
                {   vis[dx][dy]=true;
                    q.offer(new int[]{dx,dy});
                }
            }
        }
    }
    public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        graph=new char[n][m];
        vis = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            graph[i] = br.readLine().toCharArray();
        }
        int ans=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(graph[i][j]=='.'&&!vis[i][j])
                {
                    ans++;
                    bfs(i,j);
                }
            }
        }
        System.out.println(ans);

    }
}
