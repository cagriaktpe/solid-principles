package Mail;

public class EmailModel {
    public String mailAddress;
    public String mail;

    public String sendTime;

    public EmailModel(String mailAddress, String mail, String sendTime) {
        this.mailAddress = mailAddress;
        this.mail = mail;
        this.sendTime = sendTime;
    }

    public void setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress;
    }

    public String getMailAddress() {
        return mailAddress;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getMail() {
        return mail;
    }

    public void setSendTime(String sendTime) {
        this.sendTime = sendTime;
    }

    public String getSendTime() {
        return sendTime;
    }
}
