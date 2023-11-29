public class DriverInfo {
    public String fullName;
    public String phoneNumber;
    public String emailAdress;

    // constructor
    public DriverInfo(String fullName, String phoneNumber, String emailAdress) {
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.emailAdress = emailAdress;
    }

    // getter and setters
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setEmailAdress(String emailAdress) {
        this.emailAdress = emailAdress;
    }

    public String getEmailAdress() {
        return emailAdress;
    }
}
