package Practice;

import java.util.Arrays;

public class MergeArrays {

    public static void main(String[] args) {
        int k = 0;
        int a[] = {1, 2, 3, 4, 5};
        int b[] = {6, 7, 8, 9, 10};
        int n = a.length + b.length;
        int c[] = new int[n];

        for (int i = 0; i < a.length; i++, k++) {
            c[k] = a[i];
        }
        for (int i = 0; i < b.length; i++, k++) {
            c[k] = b[i];
        }

            System.out.println("The merged array is: "+Arrays.toString(c));
        }
    }

