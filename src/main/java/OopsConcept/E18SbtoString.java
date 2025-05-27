package OopsConcept;

public class E18SbtoString {
    public static void main(String[] args) {

        StringBuilder sb= new StringBuilder("Good");
        System.out.println(sb);

        String str= sb.toString();
        System.out.println(str);
        StringBuilder sb1= new StringBuilder(str);
        System.out.println(sb1);

    }
}
