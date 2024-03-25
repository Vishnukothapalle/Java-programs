                            /*program for constructor overloading */
class Rectangle
{
    int lenght;
    int breadth;
    Rectangle(int l,int b)
    {
        lenght=l;
        breadth=b;
    }
    Rectangle()
    {
        lenght=10;
        breadth=20;
    }
    void display()
    {
        System.out.println("lenght is "+lenght+"and breadth is "+breadth);
    }
}
class Overload
{
    public static void main(String args[])
    {
        Rectangle a=new Rectangle();
        Rectangle b=new Rectangle(30,40);
        a.display();
        b.display();
    }
}
/*output:

lenght is 10and breadth is 20
lenght is 30and breadth is 40
 */