package basicjava;
import java.util.*;
public class Reverse {
    public static void main(String[] args) {
        String sentence = "ms harish is gay";
        String[] words = sentence.split(" ");
        String rev = "";
        for (String word : words) {
            if (word.equals("gay")) {
                word = new StringBuilder(word).reverse().toString();
            }
            rev += word + " ";
        }
        System.out.println(rev.trim());
    }
}
