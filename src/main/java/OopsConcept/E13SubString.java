package OopsConcept;

public class E13SubString {
    public static void main(String[] args) {

        String greeting= "Hello World";
        String gre= greeting.substring(0,5);
        System.out.println(gre);

        String date= "2025-04-07";
        String year= date.substring(0,4);
        System.out.println(year);

        String sentence= "Java is good programming language";
        String sen= sentence.replace("good","best");
        System.out.println(sen);

        String fileName= "My File Name";
        String file=fileName.replace(" ","_");
        System.out.println(file);

        String text= "Hello World 123";
        String newText= text.replaceAll("[a-z]","*");
        System.out.println(newText);

        String info= "Order123Number456";
        String newInfo= info.replaceAll("[0-9]","#");
        System.out.println(newInfo);

    }
}
