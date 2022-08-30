import java.lang.*;     // he nahi lihil tari chaltay

class mythread1
{
    public static void main(String arg[])
    {
        System.out.println("inside main");

        Thread tobj=Thread.currentThread();

        System.out.println("name of current thread is: "+tobj.getName());


    }
}