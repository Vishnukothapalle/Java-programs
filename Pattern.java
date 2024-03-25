                    /*program for *
                                  **
                                  ***
                                  ****
                                  *****

                     */
import java.util.Scanner;
class Pattern
{
    public static void main(String args[])
    {
        int i,j,n;
        Scanner in=new Scanner(System.in);
        System.out.println("enter the no of rows");
        n=in.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
/*output:
 enter the no of rows
5
*
**
***
****
*****
 */