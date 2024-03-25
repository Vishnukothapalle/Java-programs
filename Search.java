                    /*program for search a number */
import java.util.Scanner;
class Search
{
    public static void main(String args[])
    {
        int a[]=new int[10];
        int i,n,m=0,k;
        System.out.println("no of elements to be inserted");
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        System.out.println("enter the array elementes");
        for(i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        System.out.println("the array elementes are");
        for(i=0;i<n;i++)
        {
            System.out.print(" "+a[i]);
        }
        System.out.println("enter the number to be searched");
        k=in.nextInt();
        for(i=0;i<n;i++)
        {
            if(a[i]==k)
            {
                m+=1;
            }
        }
        if(m==1)
        {
            System.out.println("element found");
        }
        else
        System.out.println("element not found");

    }
}
/*output:
 no of elements to be inserted
4
enter the array elementes
1
3
5
7
the array elementes are
 1 3 5 7enter the number to be searched
6
element not found
 */
