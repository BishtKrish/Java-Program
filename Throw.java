class Throw {
    static void help()
    {
        try {
            throw new NullPointerException("error_unknown");
        }
        catch (NullPointerException e) {
            System.out.println("Caught inside help().");
          
            throw e;
        }
    }
 
    public static void main(String args[])
    {
        try {
            help();
        }
        catch (NullPointerException e) {
            System.out.println(
                "Caught in main error name given below:");
            System.out.println(e);
        }
    }
}
