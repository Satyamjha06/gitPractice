package Methods;

public class Company {
    public static void main(String[] args) {

        System.out.println(Employee.CEO);

        Employee em1 = new Employee();
        em1.name= "Satyam";
        em1.salary= 5000;
        em1.name1();

        Employee em2 = new Employee();
        em2.name= "Adam";
        em2.salary= 55000;

        System.out.println(em1.name);
        System.out.println(em2.name);



    }


}
