package OopsConcept;


public class E6String {
    public static void main(String[] args) {

        String str = "Hello world java";
        //System.out.println(str.charAt(2));

        char c= str.charAt(4);
        System.out.println(c);

        for (int i=0;i<str.length();i++){
            System.out.print(str.charAt(i));
        }

        int count=0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='a'){
                count++;
            }

        }

        System.out.println(count);
    }
}