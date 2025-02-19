public class matrixwitharra {
    public static void main(String[] args) {
        int [][]e1={{1,2,3},{2,3,4}};
        int [][]e2={{4,5,6},{6,5,8}};
        int [][]result={{0,0,0},{0,0,0}};
        
        for(int i=0;i<e1.length;i++)
        {
            for(int j=0;j<e1[i].length;j++)
            {
                System.out.format("number i=%d and number j=%d",i,j);
                result[i][j]=e1[i][j]+e2[i][j];
            }
            System.out.println("");
        }
        for(int i=0;i<e1.length;i++)
        {
            for(int j=0;j<e1[i].length;j++)
            {
                System.out.print(result[i][j]+" ");
                result[i][j]=e1[i][j]+e2[i][j];
            }
            System.out.println("");
        }
    }
}
