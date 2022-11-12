package lesson8;

public class Main {
    public static void main(String[] args) {
        Array array1 = new Array(5);
        ArrayService service = new ArrayService();
        System.out.println(array1);
        service.randomizeArray(array1);
        service.printValuesOfArray(array1);
        service.deleteNumberInArray(array1, array1.getData()[0]);
        service.printValuesOfArray(array1);
        System.out.println(service.findMaxNumberInArray(array1));
        System.out.println(service.findMinNumberInArray(array1));
        System.out.println(service.findMiddleNumberInArray(array1));
    }
}
