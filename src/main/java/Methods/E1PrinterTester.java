package Methods;

public class E1PrinterTester {
    public static void main(String[] args) {

        E1Printer printer = new E1Printer();
        printer.print();
        printer.printWord("Good evening");

        printer.printMany("Java", 10);

        int sum = printer.add(10, 20);
        System.out.println(sum);

        boolean results = printer.isEven(20);
        System.out.println(results);

        int[] arr = {10, 20, 30};

        int sumOfArray = printer.sumArray(arr);
        System.out.println(sumOfArray);

        System.out.println(Employee.CEO);
    }

}
