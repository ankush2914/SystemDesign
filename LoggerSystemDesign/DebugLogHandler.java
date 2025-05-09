package LoggerSystemDesign;

public class DebugLogHandler extends LogHandler{

    public DebugLogHandler(LogHandler nexLogHandler) {
        super(nexLogHandler);
    }

    @Override
    public void log(LogType logType, String logMsg) {
        if(logType == LogType.DEBUG){
            System.out.println("[DEBUG]: "+logMsg);
        }
        else{
            super.nextHandler(logType, logMsg);
        }
    }
    
}
