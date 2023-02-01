package Practice;

class Constrctr {


    //Default Constructor
    void DefaultConstructor(){
        System.out.println("Default constructor is created");
    }

    int age;
    String name;

    void display(){
        age=34;
        name="Virat";
        System.out.println("Age : "+age+" Name : "+name);
    }

    //Parameterized Constructor

    int age1;
    String names;

    void show(int a, String n){
        age = a;
        name =n;
        System.out.println("\nParameterized Constructor");
        System.out.println("Age : "+a+" Name : "+n);
    }

    public static void main(String[] args) {
        Constrctr con = new Constrctr();
        con.DefaultConstructor();
        con.display();
        con.show(28, "Kohli");
    }
}
