import java.util.Scanner;;
public class ex1 {
    public static void main(String[] args) {
        System.out.println("CBSE PERSETAGE:");
        Scanner sc =new Scanner(System.in);
        System.out.print("Sub 1:");
        float a= sc.nextInt();
        System.out.print("Sub 2:");
        float b=sc.nextInt();
        System.out.print("Sub 3:");
        float c=sc.nextInt();
        System.out.print("Sub 4:");
        float d=sc.nextInt();
        System.out.print("Sub 5:");
        float e=sc.nextInt();
        float sum=a+b+c+d+e;
        System.out.println("Total="+sum);
        float per=(a+b+c+d+e)*100/500;
        System.out.println("personaltage="+per);
    }
    
}
