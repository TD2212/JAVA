public class arrayfindminimum {
    public static void main(String[] args) {
        int []a={-24,-5851,4517,456,2};
        int minimum=Integer.MAX_VALUE;
        for(int e:a)
        {
            if(minimum>e)
            {
                minimum=e;
            }
        }System.out.print("Minimum number="+minimum);
    }
}
