import java.util.*; 
public class set 
{ 
    public static void main(String[] args) 
    { 
        // Set deonstration using HashSet 
        Set<Integer> hash_Set = new HashSet<>(); 
        hash_Set.add(15); 
        hash_Set.add(15); 
        hash_Set.add(1); 
        hash_Set.add(6); 
        hash_Set.add(4); 
        System.out.print("Set output without the duplicates"); 
  
        System.out.println(hash_Set); 
  
        // Set deonstration using TreeSet 
        System.out.print("Sorted Set after passing into TreeSet"); 
        Set<Integer> tree_Set = new TreeSet<>(hash_Set); 
        System.out.println(tree_Set); 
    } 
} 
