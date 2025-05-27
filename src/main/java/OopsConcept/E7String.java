package OopsConcept;

public class E7String {
    public static void main(String[] args) {

        String str="Hello Java";

        /*System.out.println(str.indexOf('o'));
        System.out.println(str.indexOf('l'));*/

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i)=='l') {
                System.out.println(i);
            }
        }

    }
}
