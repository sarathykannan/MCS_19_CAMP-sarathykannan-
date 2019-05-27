import java.util.*; 
class HashMapDemo 
{ 
   public static void main(String args[]) 
   { 
       Map< String,Integer> hm =  
                        new HashMap< >(); 
       hm.put("a", 100); 
       hm.put("b", 200); 
       hm.put("c", 300); 
       hm.put("d", 400); 
  
       // Returns Set view      
       Set< Map.Entry< String,Integer> > st = hm.entrySet();    
  
       st.stream().map((me) -> {
           System.out.print(me.getKey()+":");
           return me;
       }).forEach((me) -> {
           System.out.println(me.getValue()); 
       });
   } 
} 