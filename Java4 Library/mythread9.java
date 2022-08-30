import java.lang.*;     

class marvellous extends Thread
{
    public void run()
    {
        System.out.println("inside thread :"+Thread.currentThread().getName());
        System.out.println("Thread priority is :"+Thread.currentThread().getPriority());
    }
}

class mythread9
{
    public static void main(String arg[])
    {
        System.out.println("Thread priority is :"+Thread.currentThread().getPriority());

        marvellous mobj1=new marvellous();
        Thread t1=new Thread(mobj1,"First");

        marvellous mobj2=new marvellous();
        Thread t2=new Thread(mobj2,"second");

        t1.start();
        t2.start();

    }
}