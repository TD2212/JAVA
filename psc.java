import java.time.LocalDate;
import java.util.HashMap;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.zip.DataFormatException;
 public class psc {
    public static void main(String[] args) {
        ArrayList<String> a= new ArrayList<>();
        a.add("Tirth");
        a.add("Man");
        a.add("Manthan");
        a.add("Amit");
        a.add("Rakesh");
        a.add("Sukan");
        a.add("Parth");
        a.add("Dev");
        for (String o : a) {
            System.out.println(o);
        }
        Date D= new Date();
        System.out.println(D.getHours()+":"+D.getMinutes()+":"+D.getSeconds());
        Calendar c=Calendar.getInstance();
        System.out.println(c.getTime());
        LocalTime l= LocalTime.now();
        DateTimeFormatter dt= DateTimeFormatter.ofPattern("H:m:s");
        String da=l.format(dt);
        System.out.println(da);

       HashSet<Integer> h= new HashSet<>();
       h.add(5);
       h.add(55);
       h.add(56);
       h.add(5);
       System.out.println(h);
    }
}
