public class reversewordbyword {
    public static void main(String args[]){
        String s[] ="you are not a good player" .split(" ");
        String rev =" ";
        for(int i=s.length-1;i>=0;i--){
            rev += s[i] +" ";

            }
        System.out.println("reversed string:" +rev);
        }
    }

