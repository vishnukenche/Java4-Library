import java.lang.*;

class base
{
    public int i,j;

    public void fun()      // defination
    {
        System.out.println("base fun");
    }
    public void gun()     // defination
    {
        System.out.println("base gun");
    }
    public void sun()     // defination
    {
        System.out.println("base sun");
    }
}
class derived extends base
{
    public int x,y;
    
    public void fun()       // overriding
    {
        System.out.println("derived fun");
    }
    public void sun()      // overriding
    {
        System.out.println("derived sun");
    }
    public void run()         //  defination
    {
        System.out.println("derived run");
    }

}

class virtual
{
    public static void main(String arg[])
    {
       // base bobj=new base();       // no casting
       // derived dobj=new derived();    //no casting

        base obj1=new derived();       // upcasting
        // derived obj2=new base();    // downcasting

//       same as virtual in C++

        dobj.fun();       // derived fun
        dobj.gun();       // base gun 
        dobj.sun();       // derived sun
        // obj.run();      // error
    }

}