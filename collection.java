import java.util.*;   
public class collection {
    public static void main(String[] args) {
        
         ArrayList<Integer> n1 = new ArrayList<>();
         ArrayList<Integer> n2 = new ArrayList<>();
        n1.add(5);
        n1.add(6);
        n1.add(4);
        n1.add(8);
        n1.add(3);
        n1.add(1);        
        n2.add(1);        
        n2.add(12);        
        n2.add(13);        
        n2.add(14);        
        n2.add(13);        
        n2.add(14);        
       
        for(int i=0;i<n1.size();i++)
        {
            for(int j=0;j<n2.size();j++){
               System.out.println(n1.get(i)+n2.get(j));
            }
        }
    }   
}
