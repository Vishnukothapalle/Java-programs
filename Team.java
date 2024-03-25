                /*program for cricket team */
import java.util.Scanner;
class Team
{
    public static void main(String args[])
    {
        int i,n=11;
        int a[]=new int[11];
        String s[]=new String[11];
        Scanner in=new Scanner(System.in);
        for(i=0;i<n;i++)
        {
            System.out.println("player "+(i+1)+" name");
            s[i]=in.nextLine();
        }
         for(i=0;i<n;i++)
        {
            System.out.println("palyer"+(i+1)+" Score");
            a[i]=in.nextInt();
        }
        for(i=0;i<n;i++)
        {
            System.out.print(s[i]);
            System.out.print(" "+a[i]);
            System.out.println();
        }
        int j,temp=0;
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
        }
        System.out.println("Highest scorer");
        System.out.println(""+s[i]+" "+a[i]);
    }
}
/*output:
 player 1 name
vishnu
player 2 name
bobba
player 3 name
ranga
player 4 name
anwar
player 5 name
sai
player 6 name
siddu
player 7 name
muktha
player 8 name
reddy
player 9 name
hussain
player 10 name
hemanth
player 11 name
lokesh
palyer1 Score
90
palyer2 Score
50
palyer3 Score
3
palyer4 Score
45
palyer5 Score
12
palyer6 Score
34
palyer7 Score
23
palyer8 Score
15
palyer9 Score
34
palyer10 Score
43
palyer11 Score
0
vishnu 90
bobba 50
ranga 3
anwar 45
sai 12
siddu 34
muktha 23
reddy 15
hussain 34
hemanth 43
lokesh 0
Highest scorer
vishnu 90
 */