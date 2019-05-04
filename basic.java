/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mcs;

import java.util.*;
public class basic {
    Scanner sc =new Scanner(System.in);
    int a,c;
    basic()
    {
        int b=0;
        System.out.println("enter the number");
        a=sc.nextInt();
        for(int i=0;a!=0;i++)
        {
            c=a%10;
            a=a/10;
            if(c==0)
            {
                b=b+1;
                    }
            System.out.println(a);   }               
        System.out.println("number ofd zeroes is "+b);
        }
    
    public static void main(String args[])
    {
        basic b=new basic();
        
    }
}
