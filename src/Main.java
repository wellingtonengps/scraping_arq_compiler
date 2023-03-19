import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        Map<Character, Integer> variables = new HashMap<>();

        //ReadFile.read("src/sample1.txt", variables);

        ReadFile readFile = new ReadFile();
        readFile.read("src/sample1.txt", variables);
    }
}
