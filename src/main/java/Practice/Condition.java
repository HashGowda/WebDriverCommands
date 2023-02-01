package Practice;

import org.bouncycastle.asn1.iso.ISOIECObjectIdentifiers;

public class Condition {
    public static void main(String[] args) {

        //Control Statement 1

//        int marks=82;
//        if((marks>=70)&& (marks<=100)){
//            System.out.println("FCD");
//        } else if ((marks>=60)&&(marks<70)) {
//            System.out.println("FC");
//        } else if ((marks>=50)&&(marks<60)) {
//            System.out.println("SC");

        //Control statement 2 if and else statement

//        int a=10;
//        int b=20;
//        if(a+b>30){
//            System.out.println(a+b+" Greater than 30");
//        } else {
//            System.out.println(a+b+" Less than 30");


        //Control statement 3 if-else ladder statement

//        String city = "Noida";
//        if(city=="Delhi"){
//            System.out.println("City is Delhi");
//        } else if (city=="Noida") {
//            System.out.println("City is Noida");
//        } else if (city=="Mumbai") {
//            System.out.println("City is Mumbai");
//        } else {
//            System.out.println("City is Bengaluru");



        //Control statement 4 nested if statement

        String address = "Bengaluru, Karnataka";
        if(address.endsWith("India")){
            if (address.contains("Delhi")){
                System.out.println("Address is Delhi, India");
            } else if (address.contains("Meerut")) {
                System.out.println("Address is Meerut, India");
            } else {
                System.out.println(address.split(",",0));}
            } else {
            System.out.println("You're not living in Karnataka");
            }
        }
    }

