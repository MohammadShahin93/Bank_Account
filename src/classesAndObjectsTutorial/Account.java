package classesAndObjectsTutorial;

/**
 * Created by Mujab on 12/16/17.
 */
public class Account {

    double balance;
    String accountId;
    static int nextId = 0;
    static final int ROUTING_NUMBER = 12345;

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void withdraw(double amount) {
        balance = balance - amount;
    }
}
