package Practice;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordsDuplicate {

    @Test
    public void duplicateWords() {

        String input = "Big black bug bit a big black dog on his big black nose";

        String[] words = input.split(" ");
        Set<String> wordSet = new HashSet<>();
        List<String> duplicates = new ArrayList<>();

        for (String word : words){
            if (!wordSet.add(word)){
                duplicates.add(word);
            }
        }
        System.out.println("Duplicate words : "+duplicates);
    }
}