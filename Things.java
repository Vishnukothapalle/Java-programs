                    /*program for interface to interface */
interface Cloths
{
    void display();
}
interface Kids extends Cloths
{
    void Wearing();
}
class Ludo implements Kids{
     public void display()
    {
        System.out.println("All types of cloths are available...");
    }
   public void Wearing()
    {
        System.out.println("50% off on kids wear");
    }
}
class Things
{
    public static void main(String args[])
    {
        Ludo a=new Ludo();
        a.display();
        a.Wearing();
    }
}
/*output:
 All types of cloths are available...
50% off on kids wear
 */