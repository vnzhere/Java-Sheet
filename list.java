import java.util.*;

public class list{
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
// addition of list elements
        list.add(12);
        list.add(5);
        list.add(24);
        list.add(12);
        list.add(14);

// list value update at index 1 to 26
        list.set(1,26);

// gets value as per index input 
        System.out.println(list.get(1));
    }
}