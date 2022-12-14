package Accounts;

/**
 * A {@code SavingAccount Class} which will hold all the data regarding a saving
 * account.
 * Whenever the saving account of the user is needed, the object of this class
 * is created.
 */
public class SavingAccount extends Account {

    /**
     * Parameterized constructor for saving account.
     *
     * @param name        A {@code String} holding name of the customer.
     * @param dateOfBirth An {@code int} holding age of customer.
     * @param mobileNo    A {@code String} holding mobile number of the customer.
     * @param balance     A {@code double} holding the account balance.
     */
    public SavingAccount(String name, String dateOfBirth, String mobileNo, String emailID, double balance) {
        super(name, dateOfBirth, mobileNo, emailID, balance);
    }

    /**
     * parameterize constructor to initialise name, age, mobile number and balance
     * to default values.
     */
    public SavingAccount() {
        this("", "", "", "", 0);
    }

    /**
     * Getter for minimum balance that should be present in saving account.
     * In this bank, saving account should hold minimum 3,000 balance.
     *
     * @return {@code 3000}
     */
    @Override
    public int getMinBalance() {
        return 3_000;
    }

    /**
     * Getter for maximum balance that user can withdraw at a time.
     * In this bank, saving account holders can withdraw at max 20,000 balance.
     *
     * @return {@code 20000}
     */
    @Override
    public int getWithdrawLimit() {
        return 20_000;
    }

    /**
     * A method which will return type of saving account.
     *
     * @return {@value Account#SAVING}
     */
    @Override
    public String type() {
        return Account.SAVING;
    }
}