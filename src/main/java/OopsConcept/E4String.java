package OopsConcept;

public class E4String {
    public static void main(String[] args) {

        String str= "Today is Friday";

        System.out.println(str.startsWith("Today"));
        System.out.println(str.endsWith("y"));
        boolean cond=str.startsWith("t");
        System.out.println(cond);
        System.out.println(str.contains("is"));

    }
}
