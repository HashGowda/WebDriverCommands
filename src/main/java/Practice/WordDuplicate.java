package Practice;

import org.testng.annotations.Test;

public class WordDuplicate {

    @Test
    public void DuplicateWord(){

        String main = "Big black bug bit a big black dog on his big black nose";
        int count;
        main = main.toLowerCase();
        String [] word = main.split(" ");

        System.out.println("Duplicate words in a string : ");
        for (int i=0;i<word.length;i++){
            count=1;
            for (int j=i+1;j<word.length;j++){
                if (word[i].equals(word[j])){
                    count++;
                    word[j]="0";
                }
            }

            //if count>1
            if (count>1 && word[i]!="0"){
                System.out.println(word[i]);
            }
        }
    }
}
