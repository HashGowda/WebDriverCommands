package Practice;

class FinalKeyword {
    final int age=21;
    void add(){
        int a=10;
        int b=20;
        System.out.println(a+b);
    }
}

class campus extends FinalKeyword{
    void add(){
        final String name="Virat";
        int a=20;
        int b=30;
        System.out.println(a+b);
        System.out.println(name);
    }
}

public class Student{
    public static void main(String[] args) {
        campus obj=new campus();
        obj.add();
        System.out.println();
    }
}