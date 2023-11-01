import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Main {

    private static final Logger log = Logger.getLogger(Main.class.getName());
    static {
        log.setLevel(Level.SEVERE);
        final ConsoleHandler handler =  new ConsoleHandler();
        handler.setLevel(Level.WARNING);
        log.setUseParentHandlers(false);
        log.addHandler(handler);
    }

    public static void main(String[] args) throws InterruptedException {
        log.severe("error");
        log.warning("warning");
        log.info("info");
        log.config("config");
        log.fine("fine");
        log.finer("finer");
        log.finest("finest");
    }
}