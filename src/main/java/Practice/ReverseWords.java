package Practice;

public class ReverseWords {

    public static void main(String[] args) {
        String input = "This is a string, which needs to be reverse the order of the words";
        String[] words = input.split(" ");
        StringBuilder output = new StringBuilder();

        for (int i= words.length-1;i>=0;i--){
            output.append(words[i]);
            output.append(" ");
        }
        System.out.println(output.toString().trim());
    }
}
