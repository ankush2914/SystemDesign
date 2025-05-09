package LoggerSystemDesign;

public class InfoLogHandler extends LogHandler {

    public InfoLogHandler(LogHandler nexLogHandler) {
        super(nexLogHandler);
    }

    @Override
    public void log(LogType logType, String logMsg) {
        if(logType == LogType.INFO){
            System.out.println("[INFO]: "+logMsg);
        }
        else{
            super.nextHandler(logType, logMsg);
        }
    }
}
