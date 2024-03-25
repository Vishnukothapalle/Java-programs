interface Vishnu
{
    void display();
}
interface Amma{
    void sleep();
}
interface Dad extends Vishnu,Amma
{
    void king();
}
class Raghava implements Dad{
   public  void display()
    {
        System.out.println("vishnu is brother of raghava");
    }
    public void sleep()
    {
        System.out.println("hello");
    }

}
class Main{
    public static void main(String args[])
    {
    Raghava a=new Raghava();
        a.display();
        a.sleep();
        a.king();
    }
}