class MulTable{
    final static int rows = 11;
    final static int columns = 21;
    public static void main(String args[])
    {
        int product [] [] = new int [rows] [columns];
       
        System.out.println("multiplication table");
        System.out.println(" ");
        int i,j;
        for (i=1;i<rows;i++)
        {
            for(j=11;j<columns;j++)
            {
                product[i][j] = i*j;
                System.out.println(" " +product[i][j]);
            }
            System.out.println(" ");
        }
    }
}