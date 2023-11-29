public class TripInfoLogger {
    private ILogger logger;

    public TripInfoLogger(ILogger logger) {
        this.logger = logger;
    }

    public void log(String tripInfo) {
        logger.log(tripInfo);
    }
}
