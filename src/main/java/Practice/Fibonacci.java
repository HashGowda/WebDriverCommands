package Practice;

import org.bouncycastle.asn1.iso.ISOIECObjectIdentifiers;

public class Fibonacci {

    //Fibonacci series

//    public static void main(String[] args) {
//        int a=0;
//        int b=1;
//        System.out.println(a);
//        System.out.println(b);
//        for (int i=2;i<10;i++){
//            int c=a+b;
//            System.out.println(c);
//            a=b;
//            b=c;
//        }
//    }


    //Largest number

//    public static void main(String[] args) {
//        int max=0;
//        int a[]={2,45,300,49999,45555};
//        for(int i=0; i<a.length;i++){
//            if(a[i]>max){
//                max=a[i];
//            }
//        }
//        System.out.println(max);
//        }
//    }


//Swap integers

//    public static void main(String[] args) {
//        int x = 10;
//        int y = 20;
//        System.out.println("Before swap, x:" + x);
//        System.out.println("Before swap, y:"+y);
//        x=x+y;
//        y=x-y;
//        x=x-y;
//        System.out.println("After swap, x:"+x);
//        System.out.println("After swap, y:"+y);
//    }
//}


//Triangle Numbers

    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

