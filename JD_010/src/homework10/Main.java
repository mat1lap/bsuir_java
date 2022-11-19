package JD_010.src.homework10;

public class Main {
    public static void main(String[] args) {
        Vector vector1 = new Vector(23, 57);
        Vector vector2 = new Vector(76, 21, 34);

        vector1.displayVectorInformation();
        vector2.displayVectorInformation();
        vector1.sumOfVectors(vector1, vector2).displayVectorInformation();
        vector1.differenceOfVectors(vector1, vector2).displayVectorInformation();
        System.out.println(vector1.scalarProductOfVectors(vector1, vector2));
    }
}
