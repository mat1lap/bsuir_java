package homework4;

public class tusk1 {
    public static int random(int begin,int end) {
        return (int)(Math.random()*(end - begin + 1) + begin);
    }
    public static int[][] create2Array(int size1, int size2, int begin, int end) {
        int[][] array = new int[size1][size2];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++){
                array[i][j] = random(begin, end);
            }

        }
        return array;
    }
    public static void display2Array(int[][] array) {
        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
//        1. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.

        int[][] array1 = create2Array(random(5, 10), random(5, 10), 10, 99);
        display2Array(array1);
        for (int[] ints : array1) {
            for (int j = 0; j < ints.length; j++) {
                if (array1[0][j] > array1[array1.length - 1][j]) {
                    System.out.print(ints[j] + " ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
