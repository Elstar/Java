public class Phone {
    private String operator;
    private String number;
    private String phone;
    private String error;
    protected int CORRECT_PHONE_LENGTH = 13;

    public Phone(String phone) {
        if (isPhoneCorrect(phone)) {
            setOperator(phone);
            setNumber(phone);
        }
    }

    public Phone() {
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String phone) {
        this.operator = phone.substring(0, 6);
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String phone) {
        this.number = phone.substring(6, 13);
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getError() {
        return error;
    }

    public void call(String number) {
        Network network = new Network();
        Phone outerPhone = new Phone(number);
        if (outerPhone.error == null) {
            if (network.isPhoneExist(outerPhone.operator, outerPhone.number)) {
                System.out.println("Осуществляется соединение");
            } else {
                System.out.println("Телефон не найден в базе");
            }
        } else {
            System.out.println("Некорректный номер телефона абонента");
        }
    }

    public boolean isPhoneCorrect(String phone) {
        if (phone.length() != CORRECT_PHONE_LENGTH) {
            setError("Not correct phone number");
            return false;
        }
        return true;
    }
}
