package Cars;

import Cars.BaseCar;
import Driver.DriverInfo;
import Mail.EmailModel;
import Mail.IEmailSendable;
import Mail.MailSender;
import Sms.ISMSSendable;
import Sms.SmsModel;
import Sms.SmsSender;

import java.util.List;

public class MercedesBenz extends BaseCar implements ISMSSendable, IEmailSendable {
    @Override
    public double getCostPerKM() {
        return 1.5;
    }

    public void sendTripInfoSMSToDriver(DriverInfo driver) {
        if (driver.emailAdress != null) {
            var message = "Your trip is " + tripKM + " km";
            var sms = new SmsModel(driver.phoneNumber, message, "now");
            var smsSender = new SmsSender();
            smsSender.sendSms(sms);
        }
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
