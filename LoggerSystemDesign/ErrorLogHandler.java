package LoggerSystemDesign;

public class ErrorLogHandler  extends LogHandler{

    public ErrorLogHandler(LogHandler nexLogHandler) {
        super(nexLogHandler);
    }

    @Override
    public void log(LogType logType, String logMsg) {
        if(logType == LogType.ERROR){
            System.out.println("[ERROR]: "+logMsg);
        }
        else{
            super.nextHandler(logType, logMsg);
        }
    }
    
}
