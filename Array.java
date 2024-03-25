                    /*program for Array elementes */
import java.util.Scanner;
class Array
{
    public static void main(String args[])
    {
        int a[]=new int[10];
        int n,i;
        System.out.println("enter the no of array elements to be inserted");
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        System.out.println("enter the array elements");
        for(i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        System.out.println("the array elementes are");
        for(i=0;i<n;i++)
        {
          System.out.print(" "+a[i]);
        }
    }
}
/*output;
 enter the no of array elements to be inserted
5
enter the array elements
1
2
3
4
5
the array elementes are
 1 2 3 4 5
 */
