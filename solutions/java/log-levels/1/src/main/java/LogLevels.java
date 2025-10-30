public class LogLevels {

    // 1. Return the message part (trimmed) from a log line like "[ERROR]: Invalid operation"
    public static String message(String logLine) {
        // split at the first occurrence of "]:"
        String[] parts = logLine.split("\\]:", 2);
        return parts[1].trim();
    }

    // 2. Return the log level in lowercase (e.g. "error" from "[ERROR]: ...")
    public static String logLevel(String logLine) {
        int start = logLine.indexOf('[') + 1;
        int end = logLine.indexOf(']');
        return logLine.substring(start, end).toLowerCase();
    }

    // 3. Reformat the line so the message comes first and the level in parentheses after:
    //    "[INFO]: Operation completed" -> "Operation completed (info)"
    public static String reformat(String logLine) {
        String msg = message(logLine);
        String level = logLevel(logLine);
        return String.format("%s (%s)", msg, level);
    }
}
