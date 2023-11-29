public class TripInfoLogger {
    public void logToGermany(String tripInfo) {
        GermanyLogger germanyLogger = new GermanyLogger();
        germanyLogger.log(tripInfo);
    }
}
