                        /*program for 
    1 
   121
  12321
 1234321
123454321 */
import java.util.Scanner;
class Pattern1
{
    public static void main(String args[])
    {
        int i,j,n,s,k;
        Scanner in=new Scanner(System.in);
        System.out.println("enter the no of rows");
        n=in.nextInt();
        for(i=1;i<=n;i++)
        {
            for(s=1;s<=n-i;s++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=i;j++)
            {
                System.out.print(""+j);
            }
            for(k=i-1;k>=1;k--)
            {
                System.out.print(k+"");
            }
            System.out.println(" ");
        }
    }
}
/*output:
 enter the no of rows
5
    1 
   121
  12321
 1234321
123454321
 */