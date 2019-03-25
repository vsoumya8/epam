import java.util.*;
public class Rodcut 
{

    public static int special_rod(int a)
    {
		if(a%2 ==0)
			return a/2;
		else
		{
			int c = a/2;
			int b = (int) Math.floor(c);
			return special_rod(b);
		}
    }
    public static void main(String[] args)
    {
        Scanner ns=new Scanner(System.in);
		System.out.println("Enter the number of rods");
        int n=ns.nextInt();
		int inp[] = new int[n];
		System.out.println("Enter the lengths of rods");
		for(int i=0;i<n;i++)
		{
			inp[i]=ns.nextInt();
		}
		for(int i=0;i<n;i++)
			{
				int result = special_rod(inp[i]);
				if(result == 0)
				{
					System.out.println(result);
					break;
				}
				else
					System.out.println(result);
			}
    }
}