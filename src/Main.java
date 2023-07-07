// Write code that replaces the word “cat” with the word “dog” wherever it shows up in a
//sentence
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String string = "Write code that replaces the word cat with the word dog wherever it shows up in a sentence";
        System.out.println(string);

        String risultato = string.replaceAll("cat", "dog");
        System.out.println(risultato);
    }
}