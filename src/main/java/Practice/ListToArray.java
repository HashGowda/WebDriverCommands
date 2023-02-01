package Practice;

import java.util.ArrayList;
import java.util.List;

public class ListToArray {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("ball");
        list.add("cat");
        list.add("dog");
        System.out.println("From list : "+list);
        Object obj[]=list.toArray();
        for (int i=0;i< obj.length;i++){
            System.out.println(obj[i]);
        }
    }
}
