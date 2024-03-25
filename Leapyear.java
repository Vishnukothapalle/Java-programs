                        /*program for Leapyear */
import java.util.Scanner;
class Leapyear
{
    public static void main(String args[])
    {
        int i,n;
        System.out.println("enter the year");
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        if(n%4==0)
        {
            System.out.println(n+"is a leap year");
        }
        else
        System.out.println(n+"  is not a leap year");
    }
}
/*output;
enter the year
2004
2004is a leap year
 */