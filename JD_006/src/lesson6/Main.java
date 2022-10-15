package lesson6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void displayStringElementsInRow (String string) {
        for (int i = 0; i < string.length(); i++){
            System.out.println(string.charAt(i));
        }
    }
    public static String replaceEvery4ElAnd7ElInString (String string) {
        char[] chars = string.toCharArray();
        string = "";
        for (int i = 0; i < chars.length; i++){
            if ((i + 1) % 4 == 0 || (i + 1) % 7 == 0) {
                chars[i] = '#';
            }
            string += (chars[i]);
        }
        return string;
    }
    public static int[] findFirstMiddleLastElementsInString (String string) {
        int[] arr = new int[3];
        arr[0] = string.charAt(0);
        arr[1] = string.charAt(string.length()/2);
        arr[2] = string.charAt(string.length()-1);
        return arr;
    }
    public static String kakayatoNeponyatnayaFunkciya (String string) {
        if (string.length() > 10) {
            string = string.substring(0, 6);
        } else {
            while (string.length() < 12) {
                string += "#";
            }
        }
        return string;
    }
    public static int numberAmount (String string) {
        int counter = 0;
        char[] chars = string.toCharArray();
        for (int i = 0; i < string.length(); i++) {
            if (Character.isDigit(chars[i])) {
                counter++;
            }
        }
        return counter;
    }
    public static List<String> removeRepeats (String string) {
        String[] array1 = (string.split(" "));
        List<String> strings = new ArrayList<>(Arrays.asList(array1));
        for (int i = 0; i < strings.size(); i++) {
            for (int j = 0; j < strings.size(); j++) {
                if ((i != j) && (Objects.equals(strings.get(i), strings.get(j)))) {
                    strings.remove(j);
                }
            }
        }
        return strings;
    }
    public static List<String> repeatsCounter (String string) {
        List<String> list = Arrays.asList(string.split(" "));
        List<String> repeats = new ArrayList<>();
        for (int i = 0; i < list.size(); i++){
            repeats.add(list.get(i));
            int counter = 0;
            for (String s : list) {
                if (Objects.equals(repeats.get(repeats.size() - 1), s)) {
                    counter++;
                }
            }
            repeats.add(Integer.toString(counter));
        }
        return repeats;
    }
    public static void main(String[] args) {
        String firstString = "Hello";
        String secondString = "World";
        System.out.println(firstString + " " + secondString);
        displayStringElementsInRow(firstString);
        String text = "qwertyuiopasdfghjklzxcvbnm,.<>{]''; Some";
        System.out.println(text.replace("Some", "Body wants told me the world is gone around me"));
        text = replaceEvery4ElAnd7ElInString(text);
        System.out.println(text);
        String text1 = replaceEvery4ElAnd7ElInString("Hello world! AAAAAAAAAA");
        System.out.println(text1);
        String text3 = kakayatoNeponyatnayaFunkciya("Pon");
        System.out.println(text3);
        int number = numberAmount("ofuvrevbg9 crece089 cre6");
        System.out.println(number);
        String string1 = "Hello Hello World uuu World ii hfhg ttu ii jjh";
        List<String> pon = repeatsCounter(string1);
        System.out.println(pon);
    }
}