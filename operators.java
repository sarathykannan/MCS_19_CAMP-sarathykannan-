
package mcs;
import java.util.Scanner;

public class operators {
    
    Scanner sc =new Scanner(System.in);
    int a,b,c;
    operators()
    {
        System.out.println("enter a");
        a=sc.nextInt();
        System.out.println("enter b");
        b=sc.nextInt();
     }
    void add()
    {System.out.println("addition");
        c=a+b;
        System.out.println("c="+c);
    }
    void sub()
    {System.out.println("subraction");
        c=a-b;
        System.out.println("c="+c);
    }
    void multi()
    {
        System.out.println("multi");
        c=a*b;
        System.out.println("c="+c);
    }
    void div()
    {
        System.out.println("division");
        c=a/b;
        System.out.println("c="+c);
    }
    void modulus()
    {
        System.out.println("modulud");
        c=a%b;
        System.out.println("c="+c);
    }
    void greater()
    {
        System.out.println("greater");
        if(a>b)
        {
            System.out.print("a is greater");
        }
        else{
            System.out.println("b is greater");
        }
    }
    void and()
    {
    System.out.println("and");
    if(a>0&&b>0)
    {
        System.out.println("no negative numbers");
    }
    else 
    {
        System.out.println("negative number");
    }
    }
    public static void main(String[] args)
    {
        operators o=new operators();
        o.add();
        o.sub();
        o.multi();
        o.div();
        o.modulus();
        o.greater();
        o.and();
    }
    
    
}
