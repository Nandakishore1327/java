// public class para_constructor {
//     int marks;
//     String name;
//     //constructor overloading
//     para_constructor()
//     {
//         System.out.println("hello");
//     }
//     // passing value through constructor
//     para_constructor(int a)
//     {
//         System.out.println(a);
//     }

//     public static void main(String args[])
//     {
//         para_constructor obj1=new para_constructor(10);
//         para_constructor obj2=new para_constructor();
//     }
    
// }
public class Student
{
    int marks;
    String name;
    Student(int a, String b)
    {
    //    System.out.println(a+b);
          marks=a;
          name=b;
    }
    public static void main(String args[])
    { 
        Student s=new Student(10,"nu");
        System.out.println(s.marks);
    }
}