import java.util.*;

public class list{
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
// addition of list elements
        list.add(12);
        list.add(5);
        list.add(24);
        list.add(10);
        list.add(14);

// list value update at index 1 to 26
        // list.set(1,26);

// gets value as per index input 
        // System.out.println(list.get(1));

// remove 5 from the list
        // list.remove(1);
        list.remove(Integer.valueOf(24));

// iterates from 12-14 all elements
        for (int x : list){
            System.out.println(x);
        }
        // find the total size of list
        System.out.println(list.size());

    }
}