package Practice;

import java.util.Arrays;

public class InsertAnElement {

    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6};
        int n=a.length;
        int a1[]=new int[n+1];
        int value=7;
        for (int i=0;i<n;i++){
            a1[i]=a[i];
        }
        a1[n]=value;
        System.out.println(Arrays.toString(a1));
    }
}
