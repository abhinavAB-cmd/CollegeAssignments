import java.util.*;
public class arraylist {
    public static void main(String args []){
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 10, 20, 30, 40, 50);
        System.out.println("ArrayList: " + list);
        System.out.println("Size of ArrayList: " + list.size());
        System.out.println("Element at index 2: " + list.get(2));
    }
}
