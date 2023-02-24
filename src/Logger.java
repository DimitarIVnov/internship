import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;

enum LogLevel {DEBUG, INFO, WARNING, ERROR, FATAL}

public class Logger {
    private static final HashMap<String, Logger> loggers = new HashMap<>();
    String loggerName;

    static Logger getLogger(String loggerName) {
        return new Logger(loggerName);

    }

    public Logger(String loggerName) {
        if (loggers.put(loggerName, this) != null) {
            this.loggerName = loggerName;
        } else {
            throw new ExceptionInInitializerError("Logger " + loggerName + " already exists");
        }
    }

    String log(LogLevel logLevel, String message) {
        StringBuilder stringBuilder = new StringBuilder(9);
        String pattern = "yyyy-MM-dd HH:mm:ss,SSS";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date = simpleDateFormat.format(new Date());
        stringBuilder.append(date);
        stringBuilder.append(" ");
        stringBuilder.append(logLevel);
        stringBuilder.append(" ");
        stringBuilder.append(loggerName);
        stringBuilder.append(" ");
        int stackTraceLength = Thread.currentThread().getStackTrace().length;
        stringBuilder.append(Thread.currentThread().getStackTrace()[stackTraceLength - 1]);
        stringBuilder.append(" - ");
        stringBuilder.append(message);
        return stringBuilder.toString();
    }

    void fatal(String message) {
        String messageString = log(LogLevel.FATAL, message);
        System.out.println(messageString);
    }

    void error(String message) {
        String messageString = log(LogLevel.ERROR, message);
        System.out.println(messageString);
    }

    void warning(String message) {
        String messageString = log(LogLevel.WARNING, message);
        System.out.println(messageString);
    }

    void info(String message) {
        String messageString = log(LogLevel.INFO, message);
        System.out.println(messageString);
    }

    void debug(String message) {
        String messageString = log(LogLevel.DEBUG, message);
        System.out.println(messageString);
    }


    public static void main(String[] args) {
        Logger log = Logger.getLogger("con.infinno.logger");
        log.info("text message");

    }
}
