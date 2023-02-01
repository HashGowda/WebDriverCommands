package Practice;

public class PrimeNumbers {

    public static void main(String[] args) {
        int i, j, check;
        System.out.println("Prime numbers from 2 to 10");
        for (i = 2; i <= 10; i++) {
            check = 0;
            for (j = 2; j < i; j++) {
                if (i % j == 0) {
                    check++;
                    break;
                }
            }
            if (check == 0) {
                System.out.println(i);
            }
        }
    }
}
