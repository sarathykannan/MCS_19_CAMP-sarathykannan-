import java.util.*;
public class numbertheorey {
    public static void main(String args[])
    {
        numbertheorey n1=new numbertheorey() ;
    int n,a,b;
    Scanner sc =new Scanner(System.in);
    System.out.println("enter the n");
    n=sc.nextInt();
    System.out.println("enter the a");
    a=sc.nextInt();
    int result=1;
    while(n>0)
    {
        if(n%2==1)
        {
        result=result*a;}
        a=a*a;
        n=n/2;
    }
            System.out.println("result"+result);
            
     }
}
