import java.io.*;

class vishnu
{
    public static void main(String arg[])
    {
        System.out.println("inside main");

        Thread tobj=Thread.currentThread();

        System.out.println("name of current thread is: "+tobj.getName());
    }
}
