import java.util.*;
class Buketsort
{
	public static void main (String args[])
	{
		int N,K;
		Scanner ns=new Scanner(System.in);
		N = ns.nextInt();
		K = ns.nextInt();
		int ip[]=new int[N];
		int w[]=new int[N];
		for(int i=0;i<N;i++)
		{
			ip[i]=ns.nextInt();
		}
		for(int i=0;i<N;i++)
		{
			w[i]=ip[i]%K;
		}
		for (int i = 1; i < N; i++)
            for (int j = 0; j < N-1; j++)
                if (w[j] < w[j+1])
                {
                    // swap temp and arr[i]
                    int temp = w[j];
                    w[j] = w[j+1];
                    w[j+1] = temp;
					int temp1 = ip[j];
                    ip[j] = ip[j+1];
                    ip[j+1] = temp1;
                }
		for(int i=0;i<N;i++)
		{
			System.out.print(ip[i]+" ");
		}
	}
}