                /*program for Single level inheritence */
class Movie
{
    void story()
    {
        System.out.println("horrer...");
    }
}
class Writer extends Movie
{
   void display()
   {
    System.out.println("Thriller..");
   }
}
class Singleinheritence
{
    public static void main(String args[])
    {
        Writer n=new Writer();
        n.story();
        n.display();
    }
}
/*output
 horrer...
Thriller..
 */