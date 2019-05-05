import java.util.*;
public class insertrion {
    int[] arr = new int[10];
    int i,j,a,b;
    Scanner sc = new Scanner(System.in);
    insertrion()
    {
        System.out.println("enter theb limit");
        a=sc.nextInt();
        System.out.println("enter numbers");
        for(i=0;i<a;i++)
        {
            arr[i]=sc.nextInt();
        }
          for (int i = 1; i < a; ++i) { 
            int b = arr[i]; 
            int j = i - 1;
            while (j >= 0 && arr[j] > b) { 
                arr[j + 1] = arr[j]; 
                j = j - 1; 
            } 
            arr[j + 1] =b; }
         for(i=0;i<a;i++)
         {
             System.out.println("the numbers are"+arr[i]);
         }
    
          
                
    }
    public static void main(String[] args)
    {
        
       insertrion i =new insertrion();
    }
}
