package Practice;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Palindrome {

    //Palindrome

//    public static void main(String[] args) {
//        int r, sum = 0, temp;
//        int n = 564;
//        temp = n;
//        while (n > 0) {
//            r = n % 10;
//            sum = (sum * 10) + r;
//            n = n / 10;
//        }
//        if (temp==sum){
//            System.out.println("Palindrome number");
//        } else
//            System.out.println("Not a palindrome number");
//    }
//}


//    public static void main(String[] args) {
//
//        String S = "nitin";
//        String S1 = "";
//        for (int i = S.length() - 1; i >= 0; i--) {
//            S1 = S1 + S.charAt(i);
//        }
//        if (S1.equals(S)){
//            System.out.println("Palindrome");
//        } else
//            System.out.println("Not palindrome");
//    }
//}


//Reverse a string

    void reverse(){
    String S = "Virat";
    String S1 = "";
    for (int i=S.length()-1;i>=0;i--){
        S1=S1+S.charAt(i);
    }
        System.out.println(S1);
    }

    void reverseByChar(){
        String S2="Kohli";
        String S3="";
        char c[]=S2.toCharArray();
        for (int j=c.length-1;j>=0;j--){
            S3=S3+ S2.charAt(j);
        }
        System.out.println(S3);
    }

    public static void main(String[] args) {
        Palindrome pal = new Palindrome();
        pal.reverse();
        pal.reverseByChar();
    }
}

