                /*program for hiraracial inheritance*/
class Movie
{
    void story()
    {
        System.out.println("movie getting ready... ");
    }
}
class Writer extends Movie{
    void display()
    {
        System.out.println("Dilouges ready...");
    }
}
class Director extends Movie
{
    void works()
    {
        System.out.println("Shoot ready...");
    }
}
class Cameraman extends Movie
{
    void screenplay()
    {
        System.out.println("movie ready..");
    }
}
class Hierarcialinheritance
{
    public static void main(String args[])
    {
        Cameraman n=new Cameraman();
        n.screenplay();
        n.story();
       Director a=new Director();
        a.works();
        a.story();
        Writer b=new Writer();
        b.display();
        b.story();

    }
}
/*output:
 movie ready..
movie getting ready...
Shoot ready...
movie getting ready...
Dilouges ready...
movie getting ready...
 */