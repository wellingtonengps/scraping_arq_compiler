public class FormatText {
    public static String format(String text) {

        String textFormatted = text.trim().replaceAll("\\s", "");
        textFormatted.trim().replaceAll("[\n\r]", "");

        return textFormatted;
    }

    public static boolean verifySemucilon(Character character) {
        return Character.toString(character).matches(";") ? true : false;
    }

}
