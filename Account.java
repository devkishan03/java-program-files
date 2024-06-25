package Module_9_Oops.Classes;
class Myaccount{
  public String accno;
  public String name;
  public Double balance;

  public Myaccount(String accno,String name,Double balance){
    this.accno=accno;
    this.name=name;
    this.balance=balance;
  }
  
  public double checkbalance(){
    return balance;
  }
  public double diposit(double amount){
    return balance+amount;
  }
  public double withdraw(double amount){
    return balance-amount;
  }
}

public class Account {
    public static void main(String[] args) {
        Myaccount acc=new Myaccount("1234","kishan",100.0);
        System.out.println(acc.checkbalance());
        System.out.println(acc.diposit(100));
        System.out.println(acc.withdraw(100));
    }
}
