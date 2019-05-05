import java.util.*;
public class bubblesort {
    int[] arr = new int[10];
    int i,j,a,b;
    Scanner sc = new Scanner(System.in);
    bubblesort()
    {
        System.out.println("enter theb limit");
        a=sc.nextInt();
        System.out.println("enter numbers");
        for(i=0;i<a;i++)
        {
            arr[i]=sc.nextInt();
        }
         for (int i = 0; i < a-1; i++) 
            for (int j = 0; j < a-i-1; j++) 
                if (arr[j] > arr[j+1]) 
                {
                    
                    int temp = arr[j]; 
                    arr[j] = arr[j+1]; 
                    arr[j+1] = temp; 
                } 
         for(i=0;i<a;i++)
         {
             System.out.println("the numbers are"+arr[i]);
         }
    }
    public static void main(String args[])
    {
     bubblesort b=new bubblesort();  
    
    }
}
