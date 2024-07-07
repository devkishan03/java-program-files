package Module_9_Oops.Inheritance;

class Account
{
   private String name;
   private String accno;
   private String address;
   private String DOB;
   private String mobileno;
   private String Email;
   protected double balance=0;

   public Account(String name,String accno,double balance){
      this.name=name;
      this.accno=accno;
      this.balance=balance;
   }
   public Account(String name,String accno,String mobileno,String DOB,String Email,String address){
      this.name=name;
      this.accno=accno;
      this.mobileno=mobileno;
      this.DOB=DOB;
      this.address=address;
      this.Email=Email;
   }
   public Account(String name,String accno,String mobileno,String DOB){
      this.name=name;
      this.accno=accno;
      this.mobileno=mobileno;
      this.DOB=DOB;
   }

  
   public String getName(){
    return name;
   }
   public String getAccno(){
    return accno;
   }
   public String getMobileno(){
    return mobileno;
   }
   public String getAddress(){
    return address;
   }
   public String getDob(){
    return DOB;
   }
   public String getEmail(){
    return Email;
   }
   public double getBalance(){
      return balance;
   }

   
   public void setAddress(String address){
      this.address=address;
   }
   public void setMobileno(String mobileno){
      this.mobileno=mobileno;
   }
   public void setEmail(String Email){
      this.Email=Email;
   }
  

}

class Saving extends Account
{
    
      
    

    public void deposit(double ammount){
          balance+=ammount;
    }
    public void Withdraw(double ammount){
          balance-=ammount;
    }
    public void fd(double ammount){
          balance+=ammount;
    }
    public void liquid(double ammount){
          balance-=ammount;
    }

    
}

class Loan extends Account
{
   

   public void payEmi(double ammount){
      balance-=ammount;
   }
   
}
public class Bank {
    public static void main(String[] args) {
        
    }
}
