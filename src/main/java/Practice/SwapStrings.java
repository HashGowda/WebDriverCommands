package Practice;

public class SwapStrings {
    public static void main(String[] args) {
        String a="java";
        String b="python";
        System.out.println("Before swap");
        System.out.println("a : "+a);
        System.out.println("b : "+b);
        a=a+b;

            b=a.substring(0, a.length()-b.length());
        a=a.substring(b.length());
        System.out.println("After swap");
        System.out.println("a : "+a);
        System.out.println("b : "+b);
    }
}
