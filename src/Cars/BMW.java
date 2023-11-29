package Cars;

import Cars.BaseCar;
import Driver.DriverInfo;
import Mail.EmailModel;
import Mail.IEmailSendable;
import Mail.IMultipleEmailSendable;
import Mail.MailSender;

import java.util.List;

public class BMW extends BaseCar implements IEmailSendable, IMultipleEmailSendable {
    @Override
    public double getCostPerKM() {
        return 2;
    }

    public void sendTripInfoMailToDriver(DriverInfo driver) {
        if (driver.emailAdress != null) {
            var message = "Your trip is " + tripKM + " km";
            var mail = new EmailModel(driver.emailAdress, message, "now");
            var mailSender = new MailSender();
            mailSender.sendMail(mail);
        }
    }
    
    public void sendTripInfoMailToDrivers(List<DriverInfo> drivers) {
        for (var item : drivers) {
            sendTripInfoMailToDriver(item);
        }
    }
}
