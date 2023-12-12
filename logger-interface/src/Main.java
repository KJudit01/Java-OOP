public class Main {
    public static void main(String[] args) {
        Logger consoleLogger = new ConsoleLogger();
        consoleLogger.log("Logging to console");
        Logger fileLogger = new FileLogger("log.txt");
        fileLogger.log("Logging to file");
    }
}
