package Sms;

public class SmsModel {
    public String phoneNumber;
    public String message;

    public String sendTime;

    public SmsModel(String phoneNumber, String message, String sendTime) {
        this.phoneNumber = phoneNumber;
        this.message = message;
        this.sendTime = sendTime;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setSendTime(String sendTime) {
        this.sendTime = sendTime;
    }

    public String getSendTime() {
        return sendTime;
    }
}
