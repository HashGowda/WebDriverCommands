package Practice;

public class Addition {

    void sum(int a, int b){
        int sum=a+b;
        System.out.println("Addition : "+sum);
    }

    public static void main(String[] args) {
        Addition ad = new Addition();
        ad.sum(1, 2);
    }
}
