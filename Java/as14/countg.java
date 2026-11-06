public class countg {
    public static void main(String args []){
        String str = "programming";
        int count = 0;
        char target = 'g';
        for(int i = 0 ; i < str.length(); i++){
            if(str.charAt(i) == target){
                count++;
            }
        }
        System.out.println("Number of " + target + " in " + str + ": " + count);
    }
}
