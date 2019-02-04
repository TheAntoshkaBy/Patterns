package Singleton;

public class ProgrammLogger {
    private static ProgrammLogger programmLogger;
    private static String logFile = "Log file";

    public static  ProgrammLogger getInstance() {
        if(programmLogger == null)
            programmLogger = new ProgrammLogger();
        return programmLogger;
    }
}
