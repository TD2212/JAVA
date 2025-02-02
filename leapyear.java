import java.util.Scanner;
public class leapyear {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in); 
       System.out.println("Enter year:");
         int year= sc.nextInt();
         year=year/4;
        if(year!=0)
        {
            System.out.println("It is leap year");
        }
        else{
            System.out.println("It is not leap year");
        }
    }
}
