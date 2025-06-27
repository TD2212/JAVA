

import java.text.DateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class localdatetime {
    public static void main(String[] args) {
        LocalDateTime dt=  LocalDateTime.now();
        System.out.println(dt);
        DateTimeFormatter df= DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String mydate=df.format(dt);
        System.out.println(mydate);
    }
}
