public class TripInfoLogger {
    public void logToGermany(String tripInfo) {
        GermanyLogger germanyLogger = new GermanyLogger();
        germanyLogger.log(tripInfo);
    }

    public void logToLocalStorage(String tripInfo) {
        LocalStorageLogger localStorageLogger = new LocalStorageLogger();
        localStorageLogger.log(tripInfo);
    }
}
