package basic;
import java.util.Scanner;
public class forloop 
{
    public static void main (String args[])
    {
         // int n = 5;
        Scanner s=new Scanner(System.in); 
        int a=s.nextInt();
        int b=s.nextInt();
        for (int i=a; i<=b; i=i+1)
        {
            System.out.println(i);
   
        }
    }
    
    
}
