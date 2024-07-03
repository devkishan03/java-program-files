class NegativeAmmount extends Exception {

    public String toString() {
        return "Amount should be positive";
    }

}

class InsufficientBalance extends Exception {
    public String toString() {
        return "Insufficient balance, minimum balance should be maintain 1000";
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
        if (balance >= 1000) {
            accbalance = balance;
        } else {
            System.out.println("Account should be minimum balance of 1000");
        }
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
            System.out.println(e);
        }
    }

    public void display() {
        System.out.println("acc number:" + accnumber + "\n" + "name:" + nameofholder + "\n" + "acc type:" + acctype
                + "\n" + "Account balance:" + accbalance);
    }

    public static void main(String args[]) {

        Account a1 = new Account("kishan", "123", 's', "234", 2000);

        a1.depositMoney(1000);
        a1.withdrowMoney(3000);

    }
}
