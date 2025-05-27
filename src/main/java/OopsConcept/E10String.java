package OopsConcept;

public class E10String {
    public static void main(String[] args) {

        String str= "QWQASkjsdakjs   3252653   !@#$%AS   AS&*&785opjs";

        System.out.println(str.replaceAll("[A-Z]","*" ));
        System.out.println(str.replaceAll("[a-z]","~"));
        System.out.println(str.replaceAll("[0-9]","+"));
        System.out.println(str.replaceAll("[A-Za-z0-9]",""));
        System.out.println(str.replaceAll("[^A-Z]",""));
        System.out.println(str.replaceAll("[\\s]", ""));
        System.out.println(str.replaceAll(" ", ""));

    }
}
