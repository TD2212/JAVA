import java.util.Scanner;;
public class Oddeven {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            System.out.println("Even number="+(2*i));
            System.out.println("Odd number="+(2*i+1));
           // System.out.println("----------------------");
           
        }
    }    
}
