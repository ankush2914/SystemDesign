package LoggerSystemDesign;

public class Main {
    public static void main(String[] args) {
        LogHandler logHandler = new DebugLogHandler(new InfoLogHandler(new WarningLogHandler(new ErrorLogHandler(null))));
        logHandler.log(LogType.WARN, "Please avoid using this.");
        logHandler.log(LogType.INFO, "Hi I am info log");
    }
}
