package mcs;
public class fibbonacci {
    int a=1,i,c=0,sum,sum1;
    fibbonacci()
    {
        for(i=0;sum1<4000000;i++)
        {
            sum=c+a;
            c=a;
            a=sum;
            if(sum%2==0)
            {
                sum1=sum1+sum;
           
            }
        
        }
        System.out.println("sum="+sum1);
    }
    public static void main(String[] args)
    {
        fibbonacci f=new fibbonacci();
        
    }
}
