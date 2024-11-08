import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
    private static Logger instance;
    private int messageCount = 1;

    private Logger() {
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String msg) {
        String timeStamp = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss").format(new Date());
        System.out.println("[" + timeStamp + " " + messageCount++ + "] " + msg);
    }
}