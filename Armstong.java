                /*program for Armstong number */
import java.util.Scanner;
class Armstrong
{
    public static void main(String args[])
    {
        int n,sum=0,k,m;
        System.out.println("enter the number");
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        m=n;
        while(n>0)
        {
            k=n%10;
            n=n/10;
            sum=sum+(n*n*n);
        }
        if(m==sum)
        {
        System.out.println(m+" is armstrong");
        }
        else
        System.out.println(m+" is not a arstong");
    }
}
/*output:
 enter the number
5
5 is not a arstong
*/