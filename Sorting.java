import java.util.Scanner;
class Sorting{
    public static void main(String args[])
    {
        int a[]=new int[10];
        int i,n,j,temp=0;
        System.out.println("enter gthe value of n");
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        for(i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        System.out.println("Sorting of elementes are");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
            System.out.println(" "+a[i]);
        }
    }
}

