                        /*program for abstract class */
abstract class Items
{
    abstract void price();
}
class Quantity extends Items{
    void price()
    {
        System.out.println("5kgs of rice bags...");
    }
}
class Quality extends Items{
    void price()
    {
        System.out.println("1st quality..");
    }
}
class Abstract{
public static void main(String args[])
{
    Quantity a=new Quantity();
    a.price();
    Quality b=new Quality();
    b.price();
}
}
/*output:
5kgs of rice bags...
1st quality.. */