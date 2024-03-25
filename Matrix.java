                    /*program for addition of two matrices */
import java.util.Scanner;
class Matrix
{
    public static void main(String args[])
    {
        int a[][]=new int[10][10];
        int b[][]=new int[10][10];
        int c[][]=new int[10][10];
        int n,i,j,sum=0;
        System.out.println("enter no of rows and columns");
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        System.out.println("enter the first matrix elements");
        for(i=0;i<n;i++)
        {
        for(j=0;j<n;j++)
        {
            a[i][j]=in.nextInt();
        }
        }
        System.out.println("the second matrix elements are");
        for(i=0;i<n;i++)
        {
        for(j=0;j<n;j++)
        {
            b[i][j]=in.nextInt();
        }
        }
        System.out.println("the addition of two matrices are");
        for(i=0;i<n;i++)
        {
        for(j=0;j<n;j++)
        {
            c[i][j]=a[i][j]+b[i][j];
            System.out.print(" "+c[i][j]);
        }
        System.out.println(" ");
        }
    
    }
}
/*output:
enter no of rows and columns
2
enter the first matrix elements
1
2
3
4
the second matrix elements are
1
2
3
4
the addition of two matrices are
 2 4
 6 8
 */