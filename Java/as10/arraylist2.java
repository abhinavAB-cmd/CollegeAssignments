import java.util.*;
public class arraylist2 {
    public static void main(String args []){
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 10, 20, 30, 40);
        list.set(1, 25);
        list.remove(3);
        System.out.println("ArrayList: " + list);
        System.out.println("Size of ArrayList: " + list.size());
    }
    
}
