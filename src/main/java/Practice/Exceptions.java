package Practice;

public class Exceptions {
//    public static void main(String[] args) {
//        int a=10; int b=20;
//        System.out.println(a+b);
//        int c=40; int d=30;
//        System.out.println(c-d);
//        int g=2; int f=3;
//        System.out.println(g*f);
//
//        try {
//            int x=10; int y=0;
//            System.out.println(x/y);
//        } catch (ArithmeticException e){
//            e.printStackTrace();
//            System.out.println("Exception handled");
//        }
//
//        int i=100; int j=200;
//        System.out.println(i+j);
//        int k=200; int l=100;
//        System.out.println(k=l);


//        try {
//            int a=10/0;
//        } catch (Exception e){
//            System.out.println("catch block is executed");
//            e.printStackTrace();
//        }
//        int b=10;
//        System.out.println(b);


//        void add(){
//            try {
//                int[]a={1,2,3,4};
//                System.out.println(a[4]);
//            } catch (ArrayIndexOutOfBoundsException e){
//                System.out.println("Exception handled");
//                e.printStackTrace();
//            }
//        }
//
//        void display(){
//            try {
//                String s = null;
//                System.out.println(s.length());
//            } catch (NullPointerException e){
//                System.out.println("Exception 2 handled");
//                e.printStackTrace();
//            }
//        }
//
//    public static void main(String[] args) {
//        Exceptions ex = new Exceptions();
//        ex.add();
//        ex.display();


    public static void main(String[] args) {
        try {
            int i=10/1;
            System.out.println(i);
            int a[]={1,2,3,4};
            System.out.println(a[4]);
            String S = null;
            System.out.println(S.length());
    } catch (ArithmeticException e){
            System.out.println("Arithmetic Exception");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bounds exception");
        } catch (Exception e){
            System.out.println("Parent exception");
        } int b=10;
        System.out.println(b);
    }
}

