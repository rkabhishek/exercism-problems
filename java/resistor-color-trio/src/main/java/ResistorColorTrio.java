import java.util.Map;
import java.util.TreeMap;
import java.util.LinkedHashMap;
import java.util.Collections;

class ResistorColorTrio {

    private static final String[] lookup = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet"
            , "grey", "white"};
    private static final String unit = "ohms";
    private static final Map<String, Long> prefixMap;

    static {
       prefixMap = new LinkedHashMap<>();
       prefixMap.put("giga", 1000000000L);
       prefixMap.put("mega", 1000000L);
       prefixMap.put("kilo", 1000L);
    }

    private int colorCode(String color) {
        for (int i = 0; i < lookup.length; i++) {
            if (lookup[i] == color) {
                return i;
            }
        }
        return -1;
    }

    private String format(long value) {
        String prefix = value + " ";

        for (Map.Entry<String, Long> entry: prefixMap.entrySet()) {
            if (value / entry.getValue() > 1L) {
                prefix = value / entry.getValue() + " " + entry.getKey();
                break;
            }
        }

        return prefix;
    }

    public String label(String[] colors) {
        long value = (colorCode(colors[0]) * 10 + colorCode(colors[1]))
                        * (long)(Math.pow(10, colorCode(colors[2])));

        return format(value) + unit;
    }
}
