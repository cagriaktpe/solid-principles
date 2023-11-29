package Mail;

import Driver.DriverInfo;

public interface IEmailSendable {
    void sendTripInfoMailToDriver(DriverInfo driver);
}

