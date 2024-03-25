/*program for
12345
1234
123
12
1
 */
import java.util.Scanner;
class Pattern3
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
                System.out.print(""+j);
            }
            System.out.println("");
        }
    }
}
/*output:
 enter the no of rows
5
12345
1234
123
12
1
 */