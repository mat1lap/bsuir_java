package homework6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Main {
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
        String string1 = "Hello Hello World uuu World ii hfhg ttu ii jjh";
        List<String> pon = repeatsCounter(string1);
        System.out.println(pon);
    }
}