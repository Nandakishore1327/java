package basic;
import java.util.Scanner;

public class array {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int size=s.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i=i+1)
        {
            arr[i]=s.nextInt();
        }
        
        for(int i=0;i<size;i=i+1)
        {
            System.out.println(arr[i]);
        }
    }
    
}
