                        /*program for method overridng */
class Bank
{
    void display()
    {
        System.out.println("banks in INDIA");
    }
}
class Sbi extends Bank
{
    void display()
    {
        System.out.println("one of the bank in India");
    }
}
class Axis extends Bank
{
    void display()
    {
        System.out.println("Second largest bank in the India");
    }
}
class Override
{
    public static void main(String args[])
    {
        Bank a=new Bank();
        a.display();
        Bank b=new Sbi();
        b.display();
        Bank c=new Axis();
        c.display();
        
    }
}
/*output:
 
banks in INDIA
one of the bank in India
Second largest bank in the India
 */
