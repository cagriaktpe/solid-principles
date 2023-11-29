public class LocalServerLogger implements ILogger {
    @Override
    public void log(String tripInfo) {
        System.out.println("Trip info: " + tripInfo);
    }
}
