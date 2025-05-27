package OopsConcept;

public class E11String {
    public static void main(String[] args) {
        String str="Java is easy. Java is fun";

        String[] strArr= str.split("[.]");
        System.out.println(strArr.length);
        for (int i = 0; i < strArr.length; i++) {

            System.out.println(strArr[i].trim());

        }

    }
}
