public class arrayfindmaxvalues {
    public static void main(String[] args) {
        int [] a={2,4,3434,232323,443,42};
        int max=Integer.MIN_VALUE;
        for(int e:a)
    {
        if(e>max)
        {
            max=e;
        }
    }System.out.println(max);
    }
}
