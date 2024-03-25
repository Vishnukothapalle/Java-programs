                    /*program for Type casting */
import java.util.Scanner;
class Typecasting
{
    public static void main(String args[])
    {
        double d=166.66;
        long l=(long)d;
        int i=(int)l;
        int x=5;
        long y=x;
        double z=y;
        System.out.println("implict type casting");
        System.out.println("before "+x);
        System.out.println("after "+y);
        System.out.println("after "+z);
        System.out.println("expict type casting");
        System.out.println("before "+d);
        System.out.println("after "+l);
        System.out.println("after "+i);

    }
}
/*output:
 implict type casting
before 5
after 5
after 5.0
expict type casting
before 166.66
after 166
after 166
 */