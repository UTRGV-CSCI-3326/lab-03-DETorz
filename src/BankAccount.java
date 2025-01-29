public class BankAccount
{
    public static void main(String[] args)
    {
        double BOB_BALANCE = 2175.37;
        BOB_BALANCE -= 302.50;
        BOB_BALANCE += 50.03;
        BOB_BALANCE /= 2;
        BOB_BALANCE += 20;
        --BOB_BALANCE;
        BOB_BALANCE *= 2;
        ++BOB_BALANCE;
        System.out.println("Bob's final balance is: " + BOB_BALANCE);
    }
}
