// static- non static
// package basic;

// public class func {
//     void greeting()
//     {
//         System.out.println("vanakam");
//         dummy()
//     }
//     void dummy()
//     {
//         System.out.println("vanakam");
    
//     }
//     public static void main(String args[])
//     {
//         func obj1=new func();
//         obj1.greeting();
//     }
// }



// static- non static
// package basic;

// public class func {
//     static void greeting()
//     {
//         System.out.println("vanakam");
//         dummy();
//     }
//     void dummy()
//     {
//         System.out.println("vanakam");
    
//     }
//     public static void main(String args[])
//     {
//         func obj1=new func();
//         greeting();
//     }
// }
// form a static function a non-static function cannot be called
// public class func{
//     void iphone()
//     {
//         System.out.println("iphone");
//     }
//     public static void main(String args[])
//     {
//         func f=new func();
//         f.iphone();
//     }
// }
// import java.util.Scanner;
// public class add
// {
//     Scanner s=new Scanner(System.in);
//         int a=s.nextInt();
//         int b=s.nextInt();
//     void addition()
//     {
//         System.out.println(a+b);
//     }
//     public static void main(String args[])
//     {
//         add ad=new add();
        
//         ad.addition();
//     }
// }
// import java.util.Scanner;
// public class garden{
//    int apple=20;
//    int count=10;
//    void total()
//    {
//     System.out.println(apple*count);
//    }
//    public static void main(String args[])
//    {
//     garden g=new garden();
//     g.total();
      
       
//    }
// }



//parameterized function
// import java.util.Scanner;
// public class soap
// {
//     void getsoap(int price)
//     {
    
//         System.out.println("Sandal"+price);
//     }
//     public static void main(String args[])
//     {
//         soap obj=new soap();
//         Scanner s=new Scanner(System.in);
//         int price=s.nextInt();
//         obj.getsoap(price);
//     }

// }
import java.util.Scanner;
public class arithmetic
{
    // int a=0;
    // int b=0;
    void sum(int a,int b)
    {
        System.out.println("sum="+(a+b));
    }
    void sub(int a,int b)
    {
        System.out.println("sub="+(a-b));
    }
    void mul(int a,int b)
    {
        System.out.println("mul="+a*b);
    }
    void div(int a,int b)
    {
        System.out.println("div="+a/b);
    }
    public static void main(String args[])
    {
        arithmetic ar=new arithmetic();
        ar.sum(5,4);
        ar.sub(9,8);
        ar.mul(8,7);
        ar.div(4,2);
    }
}