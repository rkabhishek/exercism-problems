public class LogLine {
    String logLine;

    public LogLine(String logLine) {
        this.logLine = logLine;
    }

    public LogLevel getLogLevel() {

        String level = getLevelFromLog();
        switch (level) {
            case "TRC":
                return LogLevel.TRACE;
            case "DBG":
                return LogLevel.DEBUG;
            case "INF":
                return LogLevel.INFO;
            case "WRN":
                return LogLevel.WARNING;
            case "ERR":
                return LogLevel.ERROR;
            case "FTL":
                return LogLevel.FATAL;
            default:
                return LogLevel.UNKNOWN;
        }
    }

    public String getOutputForShortLog() {
        return getLogLevel().getLevel() + ":" + getMessageFromLog();
    }

    private String getLevelFromLog() {
        return logLine.substring(logLine.indexOf("[") + 1, logLine.indexOf("]"));
    }

    private String getMessageFromLog() {
        return logLine.substring(logLine.indexOf("]:") + 2).trim();
    }
}
