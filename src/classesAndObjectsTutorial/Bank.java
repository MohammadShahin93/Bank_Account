package classesAndObjectsTutorial;

/**
 * Created by Mujab on 12/16/17.
 */
public class Bank {

    public static void main(String[] args) {

        Customer howard = new Customer();
        howard.firstName = "Howard";
        howard.lastName = "Guzman";
        howard.addAccount(500);

        Customer vitali = new Customer();
        vitali.firstName = "Vitali";
        vitali.lastName = "Kuchyns";
        vitali.addAccount(1000);
    }
}
