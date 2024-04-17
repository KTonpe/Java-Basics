public class arrays
{
    static int araay[][] = new int[3][4];

    public static int[][] getdata()
    {
        
        for(int i=0; i<3;i++)
        {
            for(int j=0; j<4;j++)
            {
                araay[i][j] = (int)(Math.random()*100);
            }
        }
        return araay;
    }
    public static int[][] printArray()
    {
        for(int i=0; i<3;i++)
        {
            for(int j=0; j<4;j++)
            {
                System.out.print(araay[i][j]+ " ");
            }
            System.out.println();
        }
        return araay;
    }
    public static void main(String[] args)
    {
        getdata();
        printArray();

    }
}
