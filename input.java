/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mcs;
import java.util.Scanner;
public class input {
    String n;
    Scanner sc=new Scanner(System.in);
    input()
    {
        n=sc.next();
        System.out.println("name"+n);
    }
    public static void main(String args[])
    {
        System.out.println("ENTER NAME");
        
        
        input i=new input();
        
    }
}
