                /*program for Spy number */
import java.util.Scanner;
public class Spy
{
	public static void main(String[] args) {
		int i,n,k,sum=0,pro=1,m;
		Scanner s = new Scanner(System.in);
		System.out.println("enter number to check whether the number is spy number or not");
		n=s.nextInt();
		m=n;
		while(n>0)
		{
		    k=n%10;
		    sum=sum+k;
		    pro=pro*k;
		    n=n/10;
		}
		if(sum==pro)
		{
		    System.out.println(m+" is spy number");
		}
		else
		System.out.println("it is not spy number");
	}
}
/*output:
enter number to check whether the number is spy number or not
123
123 is spy number */