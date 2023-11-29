import Mail.MailModel;
import Mail.MailSender;
import Sms.SmsModel;
import Sms.SmsSender;

public class MercedesBenz extends BaseCar {
    @Override
    public double getCostPerKM() {
        return 1.5;
    }
}
