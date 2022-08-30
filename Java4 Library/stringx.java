import java.io.*;

class stringx
{
    public static void main(String a[])
    {
        //   string literal   //
        String str1="Hello";
        String str2="World";

        System.out.println(str1);      // Hello //
        System.out.println(str1.length());    // 5 //

        String str3=str1+str2;
        System.out.println(str3);      // HelloWorld //
        String str4="Hello";

        // string objects //
        String str5=new String("Hello");
        String str6=new String("world");
        String str7=new String("Hello");


    }
}