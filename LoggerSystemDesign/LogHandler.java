package LoggerSystemDesign;

public abstract class LogHandler {
    LogHandler nextLogHandler;
    public LogHandler(LogHandler nexLogHandler){
        this.nextLogHandler = nexLogHandler;
    }
    public abstract void log(LogType logType, String logMsg);
    public void nextHandler(LogType logType, String logMsg){
        if(nextLogHandler!=null)
            nextLogHandler.log(logType, logMsg);
    }
}
