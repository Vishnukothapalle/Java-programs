                /*programe for method overloading */
class Method
{
    void number()
    {
        System.out.println("no number is entered");
    }
    void number(int n,int c)
    {
        System.out.println(""+n+" "+c);
    }
    void number(double b)
    {
        System.out.println(""+b);
    }
}
class Overloadmethod
{
    public static void main(String args[])
    {
        Method a=new Method();
        a.number();
        a.number(10,20);
        a.number(30);
    }
}
/*output:

no number is entered
10 20
30.0
 */