/*program for
55555
4444
333
22
1 */
import java.util.Scanner;
class Pattern2
{
    public static void main(String args[])
    {
        int i,j,n;
        Scanner in=new Scanner(System.in);
        System.out.println("enter the no of rows");
        n=in.nextInt();
        for(i=n;i>=1;i--)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(""+i);
            }
            System.out.println("");
        }
    }
}
/*ooutput:
 enter the no of rows
5
55555
4444
333
22
1
 */