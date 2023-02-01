//package Practice;
//
//class ThisKeyword {


    //Instance and local variables are same
//    int age;
//    String name;
//    String city;
//
//    void Student(String name, int age, String city){
//        this.name=name;
//        this.age=age;
//        this.city=city;
//    }
//
//    void showResults(){
//        System.out.println("Age : "+age+", Name : "+name+", City : "+city);
//    }
//
//    public static void main(String[] args) {
//        ThisKeyword tk = new ThisKeyword();
//        tk.Student("Praveen", 21, "Bangalore");
//        ThisKeyword tw= new ThisKeyword();
//        tw.Student("Kiran",25,"Mysore");
//        tk.showResults();
//        tw.showResults();
//    }
//}


    //To invoke current class method

//    void add(){
//    int a=10;
//    int b=20;
//    int sum=a+b;
//        System.out.println(sum);
//        this.multiply();
//    }
//
//    void multiply(){
//        int a=10;
//        int b=20;
//        int mul = a*b;
//        System.out.println(mul);
//    }
//
//    public static void main(String[] args) {
//        ThisKeyword th = new ThisKeyword();
//        th.add();
//    }
//}


    //To invoke the current class constructor

    //Calling parameterized constructor from default constructor

//    void StudentA(){
//    this("Mysore");
//    int age=21;
//    String name="Praveen";
//        System.out.println("Age : "+age+", Name : "+name);
//    }
//
//    void StudentB(String city){
//        System.out.println("City : "+city);
//    }
//
//    public static void main(String[] args) {
//        ThisKeyword t = new ThisKeyword();
//        t.StudentA();
//        t.StudentB();
//    }
//}


