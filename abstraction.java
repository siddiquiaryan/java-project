abstract class Account{
    abstract void accountProperties(int acc_no,double roi);
}

class SavingAccount extends Account
{
    void accountProperties(int acc_no,double roi)
    {
        System.out.println("SAVING ACC NO:\n"+acc_no);
        System.out.println("SAVING ROI:\n"+roi);
    }
}

class CurrentAccount extends Account
{
    void accountProperties(int acc_no,double roi)
    {
        System.out.println("CURRENT ACC NO:\n"+acc_no);
        System.out.println("CURRENT ROI:"+roi);
    }
}

class Main
{
    public static void main(String args[])
    {
        Account s_acc = new SavingAccount();
        Account c_acc = new CurrentAccount();
        s_acc.accountProperties(1132,11.55);
        c_acc.accountProperties(7828,0); 
    }
}