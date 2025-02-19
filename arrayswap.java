public class arrayswap {
    public static void main(String[] args) {
        int [] a={1,2,3,4,5};
        int l=a.length;
        int m=Math.floorDiv(l,2);
        int temp;
        for(int i=0;i<m;i++)
        {
            temp=a[i];
            a[i]=a[l-i-1];
            a[l-i-1]=temp;
        }
        for(int element:a)
        {
            System.out.print(element+" ");
        }
    }
}
