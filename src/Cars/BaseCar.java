package Cars;

import Mail.EmailModel;
import Mail.MailSender;
import Sms.SmsModel;
import Sms.SmsSender;
import Driver.DriverInfo;

public abstract class BaseCar {
    public int tripKM;

    public void go() {
        System.out.println("Car is going");
    }

    public void stop() {
        System.out.println("Car is stopped");
    }

    public abstract double getCostPerKM();


    // getters and setters
    public void setTripKM(int tripKM) {
        this.tripKM = tripKM;
    }

    public int getTripKM() {
        return tripKM;
    }
}
