package lesson8;

import javax.swing.text.html.parser.Parser;
import java.util.Arrays;

public class ArrayService {
    private static final int LOWER_BORDER = 0;
    private static final int UPPER_BORDER = 9;

    public void randomizeArray(Array array) {
        int[] data = array.getData();
        for (int i = 0; i < data.length; i++) {
            data[i] = (int)(Math.random() * (UPPER_BORDER - LOWER_BORDER+ 1)) + LOWER_BORDER;
        }
        array.setData(data);
    }

    public int findNumberInArray(Array array, int numberToFind) {
        int[] data = array.getData();
        int num = -1;
        for (int datum : data) {
            if (datum == numberToFind) {
                num = numberToFind;
                break;
            }
        }
        return num;
    }

    public void deleteNumberInArray(Array array, int numberToDelete) {
        int[] data = array.getData();
        array.setData(Arrays.stream(data).filter(value -> value != numberToDelete).toArray());
//        int[] data = array.getData();
//        String strArray = "";
//        for (int datum : data) {
//            if (datum != numberToDelete) {
//                strArray += datum + " ";
//            }
//        }
//        String[] arrayString = strArray.split(" ");
//        int[] newArray = new int[arrayString.length];
//        for (int i = 0; i < newArray.length; i++) {
//            newArray[i] = Integer.parseInt(arrayString[i]);
//        }
//        array.setData(newArray);
    }

    public int findMaxNumberInArray(Array array) {
        int[] data = array.getData();
        int max = data[0];
        for (int datum : data) {
            if (datum > max) {
                max = datum;
            }
        }
        return max;
    }

    public int findMinNumberInArray(Array array) {
        int[] data = array.getData();
        int min = data[0];
        for (int datum : data) {
            if (datum < min) {
                min = datum;
            }
        }
        return min;
    }

    public double findMiddleNumberInArray(Array array) {
        int[] data = array.getData();
        double sum = 0;
        for (int datum : data) {
            sum += datum;
        }
        return (sum/data.length);
    }

    public void printValuesOfArray(Array array) {
        int[] data = array.getData();
        for (int ints : data) {
            System.out.print(ints + " ");
        }
        System.out.println();
    }
}
