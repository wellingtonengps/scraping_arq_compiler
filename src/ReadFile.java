import java.io.File;
import java.util.Map;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ReadFile {

    String line = "";
    String lineFormatted = "";
    public void read(String path, Map<Character, Integer> variables) {

        try {
            File file = new File(path);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                this.line = scanner.nextLine();
                this.lineFormatted = FormatText.format(line);

                System.out.printf(lineFormatted);
                if(Verify.verifier(this.lineFormatted) == 1){
                    try {
                        System.out.printf(this.lineFormatted.charAt(0) + "=" + String.valueOf(variables.get(this.lineFormatted.charAt(0))));
                    } catch (Exception e){
                        System.out.println("Error verifier: " + e.getMessage());
                    }
                }

                if(Verify.verifier(this.lineFormatted) == 2){
                    variables.put(this.lineFormatted.charAt(0), parseInt(this.lineFormatted.substring(2, this.lineFormatted.length() - 1)));
                }
            }
            scanner.close();
        } catch (Exception e) {
            System.out.println("Error when read file: " + e.getMessage());
        }
    }
}
