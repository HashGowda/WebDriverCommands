package Practice;

public class Constructor {
//    int age;
//    String name;
//
//    Constructor(){
//        age=21;
//        name="Shehzada";
//        System.out.println("Age : "+age+"\nName : "+name);
//    }
//
//    public static void main(String[] args) {
//        Constructor obj = new Constructor();
//    }
//}


//        void add(){
//        int a=10;
//        int b=20;
//        int sum=a+b;
//        System.out.println(sum);
//            //multiply();
//        }
//
//        void multiply(){
//            int a=10;
//            int b=20;
//            int mul=a*b;
//            System.out.println(mul);
//            add();
//        }
//
//            public static void main(String[] args) {
//                Constructor con= new Constructor();
//                con.multiply();
//                con.multiply();
//            }
//        }


//        Constructor (){
//        this("Mysore");
//        int age=21;
//        String name="Kiran";
//            System.out.println("Age : "+age+", Name : "+name);
//        }
//
//        Constructor(String city){
//            System.out.println("City : "+city);
//        }
//
//    public static void main(String[] args) {
//        Constructor con = new Constructor();
//    }
//}


//        Constructor(){
//            int age=21;
//            String name="Kohli";
//            System.out.println("Age : "+age+", Name : "+name);
//        }
//
//        Constructor(String city){
//            this();
//            System.out.println("City : "+city);
//        }
//
//    public static void main(String[] args) {
//        Constructor obj=new Constructor("Mysore");
//    }
//}


//        int age;
//        String name;
//        String city;
//        String college;
//
//        Constructor(String name, int age, String city, String collName){
//            this.age=age;
//            this.name=name;
//            this.city=city;
//            college=collName;
//            System.out.println("Age : "+this.age);
//            System.out.println("College name : "+college);
//        }
//
//        void showResult(){
//            System.out.println("Name : "+name +", City : "+city);
//        }
//
//    public static void main(String[] args) {
//        Constructor obj=new Constructor("Kohli", 21,"Bengaluru","DBIT");
//        obj.showResult();
//        Constructor obj1= new Constructor("Virat",25,"Delhi","CBIT");
//        obj1.showResult();
//    }
//}


//        Constructor(){
//            String name="Kohli";
//            String city = "Delhi";
//            System.out.println("Name : "+name);
//            System.out.println("City : "+city);
//        }
//
//        Constructor(String name, String city, int age){
//            System.out.println("Name : "+name);
//            System.out.println("City : "+city);
//            System.out.println("Age : "+age);
//        }
//
//        Constructor(String branch){
//            System.out.println("Branch : "+branch);
//        }
//
//        void display(){
//            int age=21;
//            System.out.println("Age : "+age);
//        }
//
//        void addition(int a, int b){
//            int sum=a+b;
//            System.out.println("Sum : "+sum);
//        }
//
//    public static void main(String[] args) {
//        System.out.println("Main method");
//        Constructor obj= new Constructor();
//        Constructor obj1= new Constructor("Mechanical");
//        obj.display();
//        obj.addition(10,20);
//        obj.addition(20,30);
//        obj.addition(30,40);
//
//        Constructor obj2= new Constructor("Kohli","Delhi",34);
//    }
//}


        Constructor(int age, String city){
            System.out.println("Constructor with int and String");}

        Constructor(String name, int age){
            System.out.println("Constructor with String and int");
        }

        Constructor(int number){
            System.out.println("Constructor with one parameter");
        }

    public static void main(String[] args) {
        Constructor ob=new Constructor(21," ");
        Constructor ob1= new Constructor(" ",22);
        Constructor ob2 = new Constructor(33);
    }
}

