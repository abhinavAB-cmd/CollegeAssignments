public class reversedString {
    public static void main(String args []){
        String str = "java";
        String str2 = "";
        for(int i = 0; i < str.length(); i++){
            str2 = str.charAt(i) + str2;
        }
        System.out.println("Reversed string: " + str2);
    }
}
