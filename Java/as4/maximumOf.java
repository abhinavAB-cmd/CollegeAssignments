public class maximumOf {
    public static void main(String args []){
        int a = 10;
        int b = 20;
        int max = maxOf(a, b);
        System.out.println( max + " is the maximum number.");
    }
    public static int maxOf(int a, int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }
}
