import java.util.*;
public class dimensionalarray {
    
   
   static int[][] a=new int[3][3];
    
    public static void main(String[] args)
    { int i,j;
     Scanner sc=new Scanner(System.in);
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                a[i][j]=sc.nextInt();
                
            }
        }
        for(i=0;i<3;i++)
        { System.out.println("");
            for(j=0;j<3;j++)
            {
                System.out.print("\t"+a[i][j]);
                
            }
        }
    }
}
