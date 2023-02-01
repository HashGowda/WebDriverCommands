package Practice;

public class Pattern {
    public static void main(String[] args) {

        //Right triangle star pattern

//        for (int i=0; i<6;i++){
//            for (int j=0; j<i;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
//}

        //Left triangle star pattern

//        for (int i=0;i<6;i++){
//            for (int j=2*(6-i);j>=0;j--){
//                System.out.print(" ");
//            }
//            for (int j=0;j<i;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
//}


        //Pyramid Star Pattern

//        for (int i=0; i<6;i++){
//            for (int j=6-i;j>1;j--){
//                System.out.print(" ");
//            }
//            for (int j=0;j<=i;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
//}


        //Downward Triangle Star Pattern

//        int row=6;
//        for (int i=row-1; i>=0;i--){
//            for (int j=0;j<=i;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
//}


        //Mirrored Right Triangle Star Pattern

//        int n =7;
//        for (int i=0;i<=n;i++){
//            for (int j=1;j<n-i;j++){
//                System.out.print(" ");
//            }
//            for (int k=0;k<=i;k++){
//                System.out.print("*");
//            }
//            System.out.println("");
//        }
//    }
//}


        //Reverse Pyramid Star Pattern

//        int r = 8;
//        for (int i = 0; i <= r; i++) {
//            for (int j = 0; j <= i; j++) {
//                System.out.print(" ");
//            }
//            for (int k = 0; k < r - 1 - i; k++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
//}


        //Right down mirror star pattern

        int r=7;
        for (int i=r;i>=1;i--){
            for (int j=r;j>i;j--){
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
