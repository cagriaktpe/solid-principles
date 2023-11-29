package Cars;

import Cars.BaseCar;
import Driver.DriverInfo;
import Mail.EmailModel;
import Mail.IEmailSendable;
import Mail.MailSender;
import Sms.SmsModel;
import Sms.SmsSender;

public class BMW extends BaseCar implements IEmailSendable {
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
}
