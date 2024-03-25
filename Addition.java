                        /*program for sum of natural numbers using recursion */
import java.util.*;
class Number
{
       int add(int n)
        {
            if(n==0)
            return 0;
            else
            return n+(n-1);
        }
}
class Addition
{
    public static void main(String args[])
    {
        int n,Number=0;
        System.out.println("enter the number");
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        Number a=new Number();
        Number=a.add(n);
        System.out.println("sum= "+Number);
    }
}
/*output:
enter the number
10
sum= 45
 */