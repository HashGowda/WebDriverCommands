package Practice;

public class Arrays {
    public static void main(String[] args) {

        //Single dimensional array

//        String a[]=new String[4];
//        a[0]="10";
//        a[1]="20";
//        a[2]="30";
//        a[3]="40";
//
//        System.out.println("Size of the array : "+a.length);
//        for (int i=0; i< a.length;i++){
//            System.out.println(a[i]);
//        }
//
//        String S[]={"Apple", "Ball","Cat","Dog","Elephant"};
//        System.out.println("\nArray size : "+S.length);
//        for (int j=S.length-1; j>=0;j--){
//            System.out.println(S[j]);
//        }
//    }
//}

        //Two dimensional array

        String[][] a = new String[2][3];
        a[0][0]="10";
        a[0][1]="20";
        a[0][2]="30";
        a[1][0]="40";
        a[1][1]="50";
        a[1][2]="60";

        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("*******************");

        int[][]b={{10,20,30},{40,50,60},{70,80,90}};
        for (int i=0;i<b.length;i++){
            for (int j=0;j<b[i].length;j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
    }
}