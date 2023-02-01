package Practice;

import java.util.Arrays;

class SortBubble {

    public static void main(String[] args) {
        int arr[]={23,43,13,65,11,62,76,83,9,71,84,34,96,80};
        System.out.println("Original array : "+ Arrays.toString(arr));
        int n=arr.length;

        //iterate over the array comparing adjacent elements
        for (int i=0; i<n-1;i++) {
            for (int j = 0; j < n - i - 1; j++) {

                //if elements not in order, swap them
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
                System.out.println("Sorted array : "+Arrays.toString(arr));
        }
    }

