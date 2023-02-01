package Practice;

import java.sql.Array;
import java.util.Arrays;

public class RemoveAnElement {

    public static void main(String[] args) {
        int a[]={25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        System.out.println("Original array: "+ Arrays.toString(a));
        int removeIndex = 1;
        for (int i=removeIndex; i<a.length-1; i++){
            a[i]=a[i+1];
        }
        System.out.println("Array after removing the second element: "+Arrays.toString(a));
    }
}
