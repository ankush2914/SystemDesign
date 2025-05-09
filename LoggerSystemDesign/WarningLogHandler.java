package LoggerSystemDesign;

public class WarningLogHandler extends LogHandler{

    public WarningLogHandler(LogHandler nexLogHandler) {
        super(nexLogHandler);
    }

    @Override
    public void log(LogType logType, String logMsg) {
        if(logType == LogType.WARN){
            System.out.println("[WARNING]: "+logMsg);
        }
        else{
            super.nextHandler(logType, logMsg);
        }
    }
    
}
