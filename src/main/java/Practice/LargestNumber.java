package Practice;

public class LargestNumber {

    public static void main(String[] args) {

        //Largest number in the array

//        int a[]={10,20,30,40,50};
//        int largest=a[0];
//        for (int i=1;i<a.length;i++){
//            if (a[i]>largest){
//                largest=a[i];
//            }
//        }
//        System.out.println("Largest number in the list is: "+largest);
//    }
//}

        //Smallest number in the array

        int a[]={10,20,30,40,50};
        int smallest=a[0];
        for (int i=1;i<a.length;i++){
            if (a[i]<smallest){
                smallest=a[i];
            }
        }
        System.out.println("Largest number in the list is: "+smallest);

    }
}
