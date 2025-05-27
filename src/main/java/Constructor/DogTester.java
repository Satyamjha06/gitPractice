package Constructor;

public class DogTester {
    public static void main(String[] args) {

      Dog d= new Dog("Jacky", "White", 10);
      Dog d1= new Dog("Macky", "Black", 100);

       d.printInfo();
        d1.printInfo();
    }
}
