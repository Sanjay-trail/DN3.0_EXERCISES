public class Logger {
    private static Logger object;

    private Logger() {
    }

    public static Logger getObject() {
        if (object == null) {
            object = new Logger();
        }
        return object;
    }

    public void log(String message) {
        System.out.println("Log: " + message);
    }
}
