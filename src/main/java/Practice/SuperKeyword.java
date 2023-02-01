package Practice;

//class SuperKeyword {
//    int num=120;
//    public void display(){
//        System.out.println("Superclass method");
//    }
//}
//
//class subClass extends SuperKeyword{
//    int num=10;
//    public void display(){
//        System.out.println("Subclass method");
//    }
//
//    public void myMethod(){
//        subClass sub = new subClass();
//        sub.display();
//        super.display();
//        System.out.println("Value from subclass : "+sub.num);
//        System.out.println("Value from superclass : "+super.num);
//    }
//
//    public static void main(String[] args) {
//        subClass obj= new subClass();
//        obj.myMethod();
//    }
//}


class Superclass{
    int age;
    Superclass(int age){
        this.age=age;
    }

    public void getAge(){
        System.out.println("Value form superclass : "+age);
    }
}

public class SuperKeyword extends Superclass{
    SuperKeyword(int age){
        super(age);
    }

    public static void main(String[] args) {
        SuperKeyword sub = new SuperKeyword(24);
        sub.getAge();
    }
}
