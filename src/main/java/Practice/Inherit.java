package Practice;

class Animal{
    public void move(){
        System.out.println("Animals can move");
    }
}

class Dog extends Animal{
    public void move(){
        System.out.println("Dog can walk and run");
    }
}

public class Inherit {
    public static void main(String[] args) {
        Animal an =new Animal();
        Animal dg = new Dog();
        an.move();
        dg.move();
    }
}
