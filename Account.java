class NegativeAmmount extends Exception {

    public String toString() {
        return "Amount should be positive";
    }

}

class InsufficientBalance extends Exception {
    public String toString() {
        return "Insufficient balance, minimum balance should be maintain 1000,";
    }
}

public class Account {

    private String nameofholder;
    private String accnumber;
    private char acctype;
    private String mobilenumber;
    private double accbalance;

    public Account() {
    }

    public Account(String name, String number, char type, String monumber, double balance) {
        nameofholder = name;
        accnumber = number;
        acctype = type;
        mobilenumber = monumber;
        accbalance = balance;

    }

    public void depositMoney(double ammount) {
        try {
            if (ammount > 0) {
                accbalance += ammount;
            } else {
                throw new NegativeAmmount();
            }
        } catch (NegativeAmmount e) {
            System.out.println(e);
        }

    }

    public void withdrowMoney(double ammount) {
        try {
            if ((accbalance - ammount) < 1000) {
                throw new InsufficientBalance();
            } else {
                accbalance -= ammount;
            }
        } catch (InsufficientBalance e) {
            System.out.println(e + "Remaining acc balance:" + (accbalance - ammount));
        }
    }

    public void display() {
        System.out.println("acc number:" + accnumber + "\n" + "name:" + nameofholder + "\n" + "acc type:" + acctype
                + "\n" + "Account balance:" + accbalance + "\n" + "Mobie number:" + mobilenumber);
    }

    public static void main(String args[]) {

        Account a1 = new Account("kishan", "123", 's', "9999999999", 2000);

        a1.depositMoney(2000);
        a1.withdrowMoney(3500);
        a1.display();

    }
}
