import java.io.File;
import java.util.Scanner;

public class Verify {
    public static int verifier(String line) {

        //tipo 2: a=123; ([a-zA-Z])=([0-9])*;
        //tipo 3: c=a+b; ([a-zA-Z])=([a-zA-Z])([+])([a-zA-Z])

        if (line.matches("([a-zA-Z]);")){
            return 1;
        }
        if (line.matches("([a-zA-Z])=([0-9])*;")) {
            return 2;
        }


        return 0;
    }
}
