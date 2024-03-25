                /*program for Niven number */
import java.util.Scanner;
public class Niven
{
	public static void main(String[] args) {
	int i,n,k,sum=0,m;
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number to check");
	//	range1=s.nextInt();
	n=s.nextInt();
		m=n;
  while(n!=0)
    {
       k=n%10;
       sum=sum+k;
       n=n/10;
    }

   if(m%sum==0)
    System.out.print(" given number is niven number ");
    else
    System.out.println(" it is not a niven number");
	}
}
/*output:
 enter the number to check
120
 given number is niven number
 */