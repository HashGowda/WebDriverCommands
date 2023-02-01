package Practice;

class ConsOverloading {

    String name;
    int age;
    String city;

    void ConstrOver(String n, int a){
        name=n;
        age=a;
        System.out.println("Age : "+a+" Name : "+n);
    }

    void ConstrOver(int b, String m, String c){
        age=b;
        name=m;
        city=c;
        System.out.println("\nConstructor overloading");
        System.out.println("City : "+c+" Age : "+b+" Name : "+m);
    }

    public static void main(String[] args) {
        ConsOverloading obj = new ConsOverloading();
        obj.ConstrOver("Virat", 34);
        obj.ConstrOver(21,"Kohli","Delhi");
    }
}
