public class finalize {
    public static void main(String fe[])
    {
        finalize obj =new finalize();
        obj=null;
        System.gc();
        System.out.println("garbage collection invoked");
    }
    protected void finalize()
    {
        System.out.println("finalize method called");
        System.out.println("releases the resources");
        System.out.println("object is garbage collecteds");
    }
}
