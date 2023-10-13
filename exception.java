class test{
    public static void main(String[] args){
        int a=10,b=0;
        try{
            int c=a/b;
            System.out.println("c = " +c);

        }
        catch(Exception c)
        {
            System.out.println("This is catch : "+c);
        }

    }
}
