                    /*program for Factors */
import java.util.Scanner;
class Factor
{
    public static void main(String args[])
    {
        int i,n;
        System.out.println("enter the number");
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
       System.out.println("the factors of the given number");
       for(i=0;i<=n;i++)
        {
            if(n%i==0)
            {
                System.out.print(" "+i);
            }
        }

    }
}
/*output;
enter the number
10
the factors of the given number
1 2 5 10
*/