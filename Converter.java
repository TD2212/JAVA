import java.util.Scanner;
public class Converter {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Select the Converter");
        System.out.println("1.Km to mile");
        System.out.println("2.Celsius to Fahrenheit");
       int choice=s.nextInt();
        switch (choice) {
            case 1:
            System.out.print("enter the km=");
               float km=s.nextFloat();
                float mile=0.621371f;
                System.out.println(km+"km per mile="+(km*mile));
                break;
            case 2:
            System.out.print("enter the celsius=");
                int Celsius=s.nextInt();
                int Fahrenheit=32;
                System.out.println(Celsius+"celsius per fahrenheit"+(Celsius+Fahrenheit));
                break;
            default:
            System.out.println("Not valid");
                break;
        }
    }
}
