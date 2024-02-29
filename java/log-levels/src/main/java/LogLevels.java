public class LogLevels {

    private static final String SEPARATOR = ":";
    private static final String LOG_LEVEL_START = "[";
    private static final String LOG_LEVEL_END = "]";

    public static String message(String logLine) {
        return logLine.substring(logLine.indexOf(SEPARATOR) + 1).trim();
    }

    public static String logLevel(String logLine) {
        String s = logLine.substring(logLine.indexOf(LOG_LEVEL_START) + 1);
        s = s.substring(0, s.indexOf(LOG_LEVEL_END));
        return s.toLowerCase();
    }

    public static String reformat(String logLine) {
        return String.format("%s (%s)", message(logLine), logLevel(logLine));
    }
}
