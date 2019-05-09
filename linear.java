import java.util.*;
public class linear {
    int i,j,k;
    int[] arr=new int[10];
    Scanner sc=new Scanner(System.in);
    linear()
    {
     System.out.println("enter the limit and enter the numbers");
     j=sc.nextInt();
     for(i=0;i<j;i++)
     {
         arr[i]=sc.nextInt();
     }
     
     System.out.println("enter the number to find index");
     k=sc.nextInt();
     for(i=0;i<j;i++)
         if(k == arr[i])
         {
         
             System.out.println("index" +i);
         }
     
             }
    public static void main(String args[])
    {
        linear l=new linear();
        
    }
}
