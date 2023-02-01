package Practice;


public class DuplicateCharacters {

    public static void main(String[] args) {
        String input = "This is one string, which needs to be checked";
        int count;
        char output[] = input.toCharArray();
        System.out.println("Duplicate characters in a given string");

        for (int i=0; i<output.length;i++){
            count=1;
            for (int j=i+1; j<output.length;j++){
                if (output[i]==output[j] && output[i]!=' '){
                    count++;
                    output[j]='0';
                }
            }

            //if count>1
            if (count>1 && output[i]!='0'){
                System.out.println(output[i]+" = "+count);
            }
        }
    }
}
