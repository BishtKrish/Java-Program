public class biggestnum {
    public static void main(String[] args)
    {
    int ar[]={34,45,32,20,543,35,67,89,98};
    int max=0;
    for(int i=0;i<=ar.length-1;i++)
    if(ar[i]>max){
        max=ar[i];
    }
    System.out.println("The biggest element is:"+max);
}
}
