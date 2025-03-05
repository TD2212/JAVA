public class patternbyres {
    static int pattern(int n)
    {
        for(int i=n;i>0;i--)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        return n;
    }
    public static void main(String[] args) {
        pattern(5);
    }
}
