import java.lang.*;

class demo
{
    public int i;
    public int j;
    public static int k;

    static     // static block only initialise static characteristics  
    {
        System.out.println("Inside static block");
        k=11;
    }

    public demo()
    {
        System.out.println("Inside constructor");
        this.i=0;
        this.j=0;
    }
    public void fun()
    {
        System.out.println("Inside non static fun");
        System.out.println(this.i);       // 0
        System.out.println(this.j);      // 0
        System.out.println(this.k);     // 11
    }
    public static void gun()
    {
        System.out.println("Inside static gun");
        System.out.println(k);         // 11   ha pahila zero aahe
    }
}

class staticdemo
{
    public static void main(String a[])
    {
        demo.gun();
        demo obj;
        obj=new demo();
        
        obj.fun();

        System.out.println(obj.i);    // he last two zero aahet   //  0   
        System.out.println(obj.j);                               //  0
    
    }
}