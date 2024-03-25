                        /*program for String concat */
import java.util.Scanner;
class Stringconcat
{
    public static void main(String args[])
    {
        String s1,s2;
        System.out.println("enter th evalue of String 1");
        Scanner in=new Scanner(System.in);
        s1=in.nextLine();
        System.out.println("enter th evalue of String ");
        s2=in.nextLine();
        System.out.println("After concat="+s1.concat(s2));

    }
}
/*output:
 enter th evalue of String 1
vishnu
enter th evalue of String 
vardhan
After concat=vishnuvardhan
 */