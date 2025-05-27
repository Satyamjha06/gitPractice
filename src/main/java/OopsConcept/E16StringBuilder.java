package OopsConcept;

public class E16StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb= new StringBuilder("java");
        sb.insert(1,'a');
        System.out.println(sb);
        sb.delete(1,3);
        System.out.println(sb);

    }
}
