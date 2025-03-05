public class methodeoverloading {
    static void a()
    {
        System.out.println("Have a nice day");
    }
    static void a(int a)
    {
        System.out.println("Squer:"+(a*a));
    }
    static void a(int a,int b)
    {
        System.out.println("Addition:"+(a+b));
    }
    public static void main(String[] args) {
        a();
        a(4);
        a(4,5);
    }
}
