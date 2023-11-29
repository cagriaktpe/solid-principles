package Mail;

import Driver.DriverInfo;

import java.util.List;

public interface IEmailSendable {
    void sendTripInfoMailToDriver(DriverInfo driver);
    void sendTripInfoMailToDrivers(List<DriverInfo> driver);
}

