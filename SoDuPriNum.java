import java.util.HashMap;
import java.util.Map;

public class SoDuPriNum{
    static boolean isPrime(int num){
        if(num<=1){
            return false;
        }
        for (int i=2;i*i<=num;i++){
            if(num%i==0){

                return false;
            }
        }
        
        return true;
    }
    public static void main(String[] args){
        int[] arr={2,3,4,5,11,11,45};

        Map<Integer,Integer>primeCount=new HashMap<>();

        for (int num:arr){
            if(isPrime(num)){
                primeCount.put(num, primeCount.getOrDefault(num,0)+1);
            }
        }
        int sum=0;

        for(int prime: primeCount.keySet()){
            int count=primeCount.get(prime);
            if(count>1){
                sum+=prime*count;
            }
        }
        System.out.println("Sum of duplicate prime numbers:" +sum);
    }
}
