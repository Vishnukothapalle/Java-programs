                    /*program for interface */
interface Bill
{
    void mall();
}
class Shopping implements  Bill
{
    public void mall()
    {
        System.out.println("All items are available..");
    }
}
class Interface{
    public static void main(String args[])
    {
    Shopping a=new Shopping();
    a.mall();
    }
}
/*output:
All items are available..
 */

