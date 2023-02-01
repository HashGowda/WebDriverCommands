package Practice;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int n=a.length;
        for (int i=0;i<n/2;i++){
            int temp=a[i];
            a[i]=a[n-i-1];
            a[n-i-1]=temp;
        }
        System.out.println("Reversed array: "+Arrays.toString(a));
    }
}
