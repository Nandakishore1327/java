import java.util.Scanner;
public class retrn {
    // void method cannot return a value
    // void getsoap(int money)
    // {
    //    int soap=18;
    //    return money % soap;
    // }
    int getsoap(int money)
    {
       int soap=18;
       return money % soap;
    }
    public static void main(String args[])
    {
        retrn r=new retrn();
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int result=r.getsoap(a);
        System.out.println(result);

        
    }
    
}
