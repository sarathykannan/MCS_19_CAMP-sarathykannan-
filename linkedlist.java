import java.util.LinkedList;

public class linkedlist {
    public static void main(String[] args)
    {
        LinkedList<String> list=new LinkedList<>();
        list.add("biscuit");
        list.add("milk");
        list.add("choco");
        System.out.println("list"+list);
        list.add(2,"ball");
        System.out.println("add at specifice place"+list);
        list.addFirst("cake");
        System.out.println("add first"+list);
        list.addLast("juice");
        System.out.println("add at last"+list);
       String e= list.removeFirst();
       System.out.println("first removed"+list);
       e=list.remove(2);
       System.out.println("removed from position 2"+list);
       int s=list.size();
       System.out.println("size"+s);
       if(list.contains("biscuit"))
       {
           System.out.println("biscuit is present");
       }
       list.clear();
       System.out.println("the list is deleted"+list);
       
       
       
                
                
                
        
    }
    
}
