package Constructor;

public class Dog {

   private String name;
    private String color;
    private int age;


    public Dog(String dName, String dColor, int dAge ){
        name= dName;
        color= dColor;
        age= dAge;
        if (age>50){
            System.out.println("Please enter valid age");
        }else {

        }


    }
    void printInfo(){
        System.out.println(name+" "+color+" "+" "+age);
}

}
