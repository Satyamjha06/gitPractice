package thisWord;

public class Dog {

    private String name;
    private String color;
    private int age;

   public Dog( String name, String color, int age){

       this.name= name;
       this.color= color;
       this.age= age;

    }
    void printInfo(){
       String name= "Jimmy";
        System.out.println(this.name+" "+color+" "+age+" ");
    }

}
