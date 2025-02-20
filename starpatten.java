import java.util.Scanner;
public class starpatten {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter Number=");
            int i=sc.nextInt();
            while(i>0)
            {
                int j=0;
                while(j<i)
                {
                    System.out.print("*");
                    j++;
                }
                System.out.print("\n");
                i--;
            }
        }
}
