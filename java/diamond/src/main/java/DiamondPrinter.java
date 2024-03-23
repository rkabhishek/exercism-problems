import java.util.List;
import java.util.ArrayList;

class DiamondPrinter {
    List<String> printToList(char a) {

        int letterCount = a - 'A' + 1;
        int rows = 2 * letterCount - 1;
        int cols = rows;
        List<String> lines = new ArrayList<>();

        for (int row = 1; row <= rows; row++) {

            StringBuilder sb = new StringBuilder();
            int spacePadding = Math.abs(letterCount - row);

            // add leading spaces
            appendSpaces(sb, spacePadding);

            // print character
            char ch = (char) (row <= letterCount ? 'A' + row - 1 : 'A' + rows - row);
            sb.append(ch);

            // add spaces between characters
            appendSpaces(sb, (cols - 2 * spacePadding) - 2); // subtracting 2 for 2 characters

            // print character (optional)
            if (row != 1 && row != rows)
                sb.append(ch);

            // add trailing spaces
            appendSpaces(sb, spacePadding);

            lines.add(sb.toString());
        }

        return lines;
    }

    private static void appendSpaces(StringBuilder sb, int maxSpaces) {
        for (int i = 1; i <= maxSpaces; i++)
            sb.append(" ");
    }
}
