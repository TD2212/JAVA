import java.util.Scanner;
public class fibonacibyuserinput {
    static int fibo(int n)
    {
        if(n==0)
        {
            return 0;
        }
        else if(n==1)
        {
            return 1;
        }
        else
        {
            return fibo(n-1)+fibo(n-2);
        }
            
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a = s.nextInt();
        System.out.print(" the  fibonacci series is : ");
        for ( int i =0; i<a;i++){
            System.out.print(fibo(i) + " " );
        }
    }
}
