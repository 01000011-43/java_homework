import java.util.Date;
//Account类
class Account {
    //数据域
    public int id;
    private double balance;
    private double annualInterestRate = 0;
    private Date dateCreated;
    
    //无参构造方法
    public Account(){
        id = 0;
        balance = 0;
        dateCreated = new Date();
    }

    //有参构造方法
    public Account(int id, double balance){
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
    }

    //id,balance,annualInterestRate访问器和修改器
    public int getID(){
        return id;
    }
    public void setID(int id){
        this.id = id;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }
    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }

    //dateCreated访问器
    public Date getDateCreated(){
        return dateCreated;
    }

    //返回月利率
    public double getMonthlyInteretRate(){
        return annualInterestRate/12;
    }

    //从账户里取钱
    public void withdraw(double amount){
        balance = balance - amount;
    }

    //存储钱
    public void deposit(double amount){
        balance = balance + amount;
    }
}

//Account类的客户
public class TestAccount{
    public static void main(String[] args){
        Account account1 = new Account();
        System.out.println("Account1 id: " + account1.id+
        "\nbalance: " + account1.getBalance()+
        "\nmonthly interest: " + account1.getMonthlyInteretRate()+
        "\nopened on: " + account1.getDateCreated().toString());
        System.out.println("------------------------------");

        Account account2 = new Account(22735,1234.45);
        account2.setAnnualInterestRate(2.0);
        account2.withdraw(500);
        account2.deposit(1000);
        System.out.println("Account2 id: " + account2.id+
        "\nbalance: " + account2.getBalance()+
        "\nmonthly_interest: " + account2.getMonthlyInteretRate()+
        "\nopened_on: " + account2.getDateCreated().toString());
    }

}
