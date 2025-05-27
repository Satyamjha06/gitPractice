package OopsConcept;

public class E17DelCharAt {
    public static void main(String[] args) {

        StringBuilder sb= new StringBuilder("Java");
        sb.deleteCharAt(1);
        System.out.println(sb);
        sb.append('s');
        sb.append(25);
        System.out.println(sb);
    }

}
