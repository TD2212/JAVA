public class vargas {
    static int add(int ...arr)
    {
        int result=0;
        for(int a:arr)
        {
            result +=a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Multiple number addition position here");
        System.out.println("Five numbers:"+add(4,6,7,8,9));
        System.out.println("Foue number Addition"+add(5,5,4,3));
        System.out.println("Two Number addition"+add(8,10));
    }
}
