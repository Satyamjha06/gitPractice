package OopsConcept;

public class Use {
    public static void main(String[] args) {
        Practice name1= new Practice();
        name1.name= "Raj";
        name1.place= "Toronto";
        name1.age= 25;
        name1.eligible();
        name1.vote();

        Practice name2= new Practice();
        name2.name= "Allen";
        name2.place= "GTA";
        name2.age= 35;
        name2.eligible();
        name2.vote();

    }
}
