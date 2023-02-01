package Practice;

import io.reactivex.rxjava3.internal.operators.flowable.FlowableOnErrorReturn;

public class LoopStatements {
    public static void main(String[] args) {

        //for loop

//        int sum = 0;
//        for (int i = 0; i <= 10; i++) {
//            sum += i;
//        }
//        System.out.println("Sum of first 10 numbers " + sum);


        //for-each loop

//        String []s={"Java", "Testing","Automation","Manual"};
//        System.out.println("Printing the content of the array names:\n");
//        for(String s1:s){
//            System.out.println(s1);


        //for loop 3 - Reverse printing

//        for (int i =10;i>=1;i--){
//            System.out.println(i);


        //for loop - even number

//        for(int i=0;i<=10;i++){
//            if(i%2==0){
//                System.out.println("Even number: "+i);


        //for loop - odd number

//        for(int i=0;i<=10;i++){
//            if(i%2==1){
//                System.out.println("Odd numbers: "+i);


        //Nested for loop - Square star pattern

//        for(int i=0; i<=4;i++){
//            for (int j=1;j<=4;j++){
//                System.out.print("* ");
//            }
//            System.out.println();


        //While loop - printing the first 10 numbers

//        int i=1;
//        while (i<=10){
//            System.out.println(i);
//            i++;


        //while loop - printing the even numbers

//        int i =0;
//        System.out.println("Printing the first 10 even numbers:\n");
//        while (i<=10){
//            System.out.println(i);
//            i+=2;


        //while loop - printing the first 10 odd numbers

//        int i=1;
//        System.out.println("Printing the first 10 odd numbers:\n");
//        while (i<=10){
//            System.out.println(i);
//            i+=2;


        //while loop - Reverse printing

//        int i=10;
//        while (i>=1){
//            System.out.println(i);
//            i--;


        //while loop - Even numbers

//        int i=0;
//        while (i<=10){
//            if(i%2==0){
//                System.out.println("Even numbers: "+i);
//            }
//            i++;


        //while loop - Odd numbers

//        int i=0;
//        while (i<=10){
//            if(i%2==1){
//                System.out.println("Odd numbers : "+i);
//            }
//            i++;


        //do while loop - printing first 10 numbers

//        int i=1;
//        System.out.println("Printing the first 10 numbers:\n");
//        do {
//            System.out.println(i);
//            i++;
//        } while (i<=10);


        //do while - printing even numbers

//        int i=0;
//        do {
//            if(i%2==0){
//                System.out.println("Even numbers: "+i);
//            } i++;
//        } while (i<=10);


        //do while - printing odd numbers

//        int i=1;
//        do {
//            if(i%2==1){
//                System.out.println("Odd numbers: "+i);
//            } i++;
//        } while (i<=10);


        //do while - Reverse printing

//        int i=10;
//        System.out.println("Printing the numbers in descending order : ");
//        do {
//            System.out.println(i);
//            i--;
//        } while (i>=1);


        //Break statement

//        for (int i=0;i<=10;i++){
//            if (i==6){
//                break;
//            }
//            System.out.println(i);

        //Continue statement

        for(int i=0;i<=10;i++){
            if (i==5){
                continue;}
                System.out.println(i);
            }
        }
    }
