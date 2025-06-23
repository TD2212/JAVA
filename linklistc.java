import java.util.*;
public class linklistc {
    public static void main(String[] args) {
    LinkedList<Integer> n1 = new LinkedList<>();
    n1.add(4);
    n1.add(3);
    n1.add(2);
    n1.add(1);
    n1.add(5);
    n1.add(6);
    n1.add(7);
    n1.addFirst(71);
    n1.addLast(72);
    
    for(int i=0;i<n1.size();i++){
        System.out.print(n1.get(i)+",");
    }
    }
}
