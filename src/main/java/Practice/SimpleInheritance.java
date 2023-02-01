package Practice;

class Calculation{
    int z;

    void addition(int x, int y){
        z=x+y;
        System.out.println("Summation = "+z);
    }

    void subtraction(int x, int y){
        z=x-y;
        System.out.println("Difference = "+z);
    }
}

public class SimpleInheritance extends Calculation {
    public void multiplication(int x, int y){
        z=x*y;
        System.out.println("Product = "+z);
    }

    public static void main(String[] args) {
        int a=20, b=10;
        SimpleInheritance sim= new SimpleInheritance();
        sim.addition(a, b);
        sim.subtraction(a,b);
        sim.multiplication(a, b);
    }
}
