					/*program for Spy range */
import java.util.Scanner;
public class Spyrange
{
	public static void main(String[] args) {
	int i,n,range1,range2;
		Scanner s = new Scanner(System.in);
		System.out.println("enter the range to get spy numbers");
	//	range1=s.nextInt();
	range2=s.nextInt();
		System.out.println("the spynumbers upto the range is");
		 for(i=1;i<=range2;i++)
    {
           int num=i;
   int sum=0,mult=1,rem;
    while(num!=0)
    {
        rem=num%10;
        sum+=rem;
        mult*=rem;
        num/=10;
    }

   if(sum==mult)
    System.out.print(" "+i);
}
	
		
		
	}
}
/*output:
 enter the range to get spy numbers
5
the spynumbers upto the range is
 1 2 3 4 5
 */