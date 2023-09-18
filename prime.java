import java.util.Scanner;

class prime {  
    public static void main(String[] args)
    {
        int n;
        Scanner s=new Scanner(System.in);
        System.out.print("enter number you want search");
        n = s.nextInt();
        for (int i = 2; i < n; i++) {
            if(n%i == 0){
                System.out.println("not prime");
    return;
            }
            
        }
        System.out.println("prime number");
    }
}
