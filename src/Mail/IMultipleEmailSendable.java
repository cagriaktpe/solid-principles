package Mail;

import Driver.DriverInfo;

import java.util.List;

public interface IMultipleEmailSendable {
    void sendTripInfoMailToDrivers(List<DriverInfo> drivers);
}
