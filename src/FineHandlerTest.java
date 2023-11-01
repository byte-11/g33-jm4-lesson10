import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.logging.XMLFormatter;

public class FineHandlerTest {
    private static final Logger log = Logger.getLogger(FineHandlerTest.class.getName());

    static {
        try {
            FileHandler handler = new FileHandler(
                    "C:\\Users\\b.kambaraliev\\IdeaProjects\\g33-jm4-lesson10\\logs\\sys_log_%u.txt",
                    1024,
                    3,
                    true
            );
            XMLFormatter xmlFormatter = new XMLFormatter();
            SimpleFormatter formatter = new SimpleFormatter();
            handler.setFormatter(xmlFormatter);
            handler.setLevel(Level.ALL);
            log.addHandler(handler);
        } catch (IOException e) {
            log.severe(e.getMessage());
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            log.severe("error");
            log.warning("warning");
            log.info("info");
            log.config("config");
            log.fine("fine");
            log.finer("finer");
            log.finest("finest");
        }
    }
}
