                    /*program for Multilevelinheritence */
class Artist
{
    void art()
    {
        System.out.println("differnt arts...");
    }
}
class Pencil extends Artist{
    void display(){
        System.out.println("pencil sketch...");
    }
}
class Oil extends Pencil{
    void paint()
    {
        System.out.println("oil paniting...");
    }
}
class Multilevelinheritence
{
    public static void main(String args[])
    {
        Oil a=new Oil();
        a.art();
        a.display();
        a.paint();
    }
}
/*output:
 differnt arts...
pencil sketch...
oil paniting...
 */