package OopsConcept;

public class E12String {

    public static void main(String[] args) {
        String report = "Data@2025#Report";
        System.out.println(report.replaceAll("[^A-Z0-9]", "-"));

        String mixed= "UserID1234";
        String repMixed= mixed.replaceAll("\\d","X");
        System.out.println(repMixed);
    }
}
