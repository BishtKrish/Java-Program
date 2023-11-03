import java.util.*;
public class nested {
    static int data=120;
    static class inner{
    static void message(){
    System.out.println("The data is "+data);
}
    }
    public static void main(String args[]){
         nested.inner.message();
    }
}
