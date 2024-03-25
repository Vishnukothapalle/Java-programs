import java.util.*;
import java.io.*;
class Arraylist
{
   public static void main(String args[])
   {
    ArrayList<String> a=new ArrayList<String>(50);
   a.add("raghava");
   a.add("vishnu");
   a.add("amma");
   a.add("nanna");
   System.out.println(a);
   a.remove("vishnu");
   System.out.println(a);

   }
}