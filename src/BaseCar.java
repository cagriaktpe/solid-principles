import Mail.MailModel;
import Mail.MailSender;
import Sms.SmsModel;
import Sms.SmsSender;

public abstract class BaseCar {
    public int tripKM;
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
            var mail = new MailModel(driver.emailAdress, message, "now");
            var mailSender = new MailSender();
            mailSender.sendMail(mail);
        }
    }

    // getters and setters
    public void setTripKM(int tripKM) {
        this.tripKM = tripKM;
    }

    public int getTripKM() {
        return tripKM;
    }
}
