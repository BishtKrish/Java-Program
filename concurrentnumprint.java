public class concurrentnumprint {
    public static void main(String[] args) {
        Thread thread1=new Thread(()-> printNumbers(1,5));
        Thread thread2=new Thread(()-> printNumbers(6,10));

        thread1.start();
        thread2.start();

    }
    private static void printNumbers(int start,int end){
        for(int i=start;i<=end;i++){
 System.out.println(Thread.currentThread().getName()+":"+i);           
        }
    }
    
}
