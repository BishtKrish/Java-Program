public class first10prinumsum {
    public static void main(String[] args){
        int sum=0;
        int j,count=0;
        for(int i=2;i<100;i++){
            boolean flag=true;
            for(j=2;j<=i/2;j++){
                if(i%j==0){
                    flag=false;
                    break;
                }
            }
            if(flag==true && count < 10){
                sum+=i;
                count++;
                System.out.println(i);
            }

        }
        System.out.println("sum is:- " + sum);
    }
}
