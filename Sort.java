                    /*program for sorting elements */
import java.util.Scanner;
class Sort
{
    public static void main(String args[])
    {
        int a[]=new int[10];
        int i,n,j,temp=0;
        System.out.println("enter the value of n");
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        for(i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        System.out.println("Array elements after sorting");
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(a[i]>a[j])
                {
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                }
            }
            System.out.print(" "+a[i]);
        }
    }
}
/*output:
 enter the value of n
4
7
9
4
5
Array elements after sorting
 4 5 7 9
 */