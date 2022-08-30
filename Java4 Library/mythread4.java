import java.lang.*;     

class marvellous extends Thread
{
    public void run()
    {
        System.out.println("inside thread :"+Thread.currentThread().getName());
        for(int i=0;i<=1000;i++)
        {
            System.out.println("Thread scheduled :"+Thread.currentThread().getName()+":"+i);
        }
    }
}

class mythread4
{
    public static void main(String arg[])
    {
        marvellous mobj1=new marvellous();
        Thread t1=new Thread(mobj1,"First");

        marvellous mobj2=new marvellous();
        Thread t2=new Thread(mobj2,"second");

        t1.start();
        t2.start();

    }
}