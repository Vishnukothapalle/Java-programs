                    /*program for password */
import java.util.Scanner;
class Password
{
    public static void main(String args[])
    {
        String s1;
        int a;
        System.out.println("enter the password");
        Scanner in =new Scanner(System.in);
        s1=in.nextLine();
        a=+s1.length();
        if(a>=8)
        {
            if(a>=97&&a<=122||a>=65&&a<=90)
            {
                if(a>=0&&a<=9)
                {
                    System.out.println("Password valid");
                }
            }
        }
        else
        System.out.println("password is invalid");
    }
}
/*output:
enter the password
vishnu   
password is invalid
 */