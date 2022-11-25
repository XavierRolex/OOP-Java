package Q6;

public class Customer {
    private int id, phone, accountNo;
    private String name, address;
    private double currentBalance;
    public Customer()
    {
        this.currentBalance=0;
    }
    public Customer(int id, int phone, int accountNo, String name, String address, double currentBalance) {
        this.id = id;
        this.phone = phone;
        this.accountNo = accountNo;
        this.name = name;
        this.address = address;
        this.currentBalance = currentBalance;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getPhone() {
        return phone;
    }
    public void setPhone(int phone) {
        this.phone = phone;
    }
    public int getAccountNo() {
        return accountNo;
    }
    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public double getCurrentBalance() {
        return currentBalance;
    }
    public void setCurrentBalance(double currentBalance) {
        this.currentBalance = currentBalance;
    }

    public void depositeMoney(double balance)
    {
        setCurrentBalance(getCurrentBalance()+balance);
        System.out.println("New Balance = "+ getCurrentBalance());
    }
    public void withdrawMoney(double balance)
    {
        if (balance>getCurrentBalance())
        {
            System.out.println("You dont have enough money in your account.");
        }
        else if (balance<=getCurrentBalance())
        {
            setCurrentBalance(getCurrentBalance()-balance);
            System.out.println("New Balance = "+getCurrentBalance());
        }
    }
    public void applyForLoan()
    {
        if (getCurrentBalance()>200000)
        {
            System.out.println("You're application has been successful.");
        }
        else
        System.out.println("Your application has been rejected.");
    }
    public void requestCard()
    {
        if (getCurrentBalance()>200000)
        {
            System.out.println("You're application has been successful.");
        }
        else
        System.out.println("Your application has been rejected.");
    }
    @Override
    public String toString() {
        return "--Customer Details--\n"+"Name: "+getName()+"\nId: "+getId()+"\nPhone Number: "+getPhone()+"\nAccount Number: "+getAccountNo()+"\nAddress: "+getAddress()+"\nBalance: "+getCurrentBalance();   
    }
    //Sir, in the uml there's no to-string, but i did it to show all the attribute's value.
}
