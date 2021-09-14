import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MyClass {
    public static void main(String args[]) {
        Map<String, Integer> m1 = new HashMap<>();
        m1.put("a", 10);
        m1.put("b", 20);
        m1.put("c", 30);
        Map<String, Integer> m2 = new HashMap<>();
        m2.put("a", 3);
        m2.put("c", 6);
        m2.put("d", 3);
    
        System.out.println(m1);
        System.out.println(m2);
    
        //iterate over second map and merge its elements into map 1 using 
        //same key and sum of values
        m2.forEach((k, v) -> m1.merge(k, v, Integer::sum));
        
        System.out.println("===========");
        System.out.println(m1);
    }
}