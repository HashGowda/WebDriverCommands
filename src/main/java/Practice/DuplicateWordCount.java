package Practice;

import org.testng.annotations.Test;

public class DuplicateWordCount {

    @Test
    public void findDuplicateWithCount() {

        String provideString = "This is one String, which needs to be tested for duplicate word, is one";

        String[] brokenString = provideString.split(" ");
        int count=1;
        System.out.println("Duplicate words in a given string : ");
        for (int i = 0; i < brokenString.length; i++) {
            for (int j = i + 1; j < brokenString.length; j++) {
                if (brokenString[i].equals(brokenString[j])) {
                    count+=1;
                    brokenString[j] = "0";
                }
            }
            //if count>1
            if (brokenString[i] != "0") {
                System.out.println(brokenString[i]+" = "+count);
                count=1;
            }
        }
    }
}

