package OopsConcept;
import java.util.Arrays;

public class E14Split {
    public static void main(String[] args) {

        String sentence= "Learning regex is useful";
        String[] splitSentence= sentence.split("\\s");
        System.out.println(Arrays.toString(splitSentence));
        System.out.println(splitSentence.length);
        for(String sen:splitSentence){
            System.out.println(sen);
        }

        String sentence1= "Hello? How are you. Fine, thanks!";
        String[] sent1=sentence1.split("[?.,]");
        System.out.println(Arrays.toString(sent1));

    }
}
