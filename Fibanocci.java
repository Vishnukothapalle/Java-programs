                    /*program for e sum and osum in fibanocci series */
import java.util.Scanner;
class Fibonacci
{
    public static void main(String args[])
    {
        int i,n,esum=0,osum=0,a=0,b=1,c;
        Scanner in=new Scanner(System.in);
        System.out.println("enter the value upto the range");
        n=in.nextInt();
        System.out.print(a+" "+b+"");
        for(i=2;i<n;i++)
        {
            c=a+b;
            a=b;
            b=c;
            System.out.print(" "+c);
            if(i%2==0)
            {
                  esum+=i;
            }
            if(i%2!=0)
            {
                osum+=i;
            }
        }
        System.out.println("esum="+esum);
        System.out.println("osum="+osum);
    }
}
/*output:
 enter the value upto the range
10
0 1 1 2 3 5 8 13 21 34
esum=20
osum=24
 */