package banking;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author wpollock
 *
 */
public class Bank {
    private final String NAME;
    private final Map<String, Customer> customers = new HashMap<>();
    private double insufficientFundsPenalty = 10.00;  // Default, in dollars

    /** Creates a new Bank object with the given name.
     *
     * @param name Name of the bank
     */
    public Bank (String name) {
        this.NAME = "";  // Stub
    }

    /** Starts up the Bank simulator
     * @param args command line arguments - ignored
     */
    public static void main (String[] args) {
        System.out.println("Hello from Bank");  // Stub
    }

    /**
     * @return the insufficientFundsPenalty
     */
    public  double getInsufficientFundsPenalty () {
        return insufficientFundsPenalty;
    }

    /**
     * @param insufficientFundsPenalty the insufficientFundsPenalty to set
     */
    public void setInsufficientFundsPenalty (double insufficientFundsPenalty) {
        // Stub
    }

    /**
     * @return the name
     */
    public String getNAME () {
        return NAME;
    }

    /** Adds a new bank account
     *
     */
    public void addAccountWizard () {
        // Stub
    }

    /** Generates a report of all current accounts, in account ID order
     * @return A list of all accounts of all customers of this bank, sorted
     * by ID.
     *
     */
    public SortedSet<Account> getAllAccounts () {
        // for each customer, get accounts and add to sorted set.
        return null;  //Stub
    }

    /** Add a new customer to the bank, using a GUI form
     *
     */
    public void addCustomerWizard () {
    }

    /** Add a new customer to the bank.
     * @param lastName Customer's last (sur- or family) name
     * @param firstName Customer's first (or given) name
     * @return the customer's ID
     */
    public String addCustomer (String lastName, String firstName) {
        return null;  // Stub
    }

    /** Deletes a customer from the bank.
     * (In reality, just marks the customer as non-current.)
     * @param customerId the ID of the customer to remove
     */
    public void removeCustomer (String customerId) {
        // Stub
    }

    /** Generates a report of all current customers, in customer ID order
     * @return SortedSet of all customers at this bank.
     */
    public SortedSet<Customer> getAllCustomers () {
        return null;  // Stub
    }

    /** Get a Customer object, given a customer's ID
     *
     * @param customerId The ID of the customer
     * @return That customer's Account, or null
     */
    public Customer getCustomer (String customerId) {
        return null;  // Stub
    }

    /** Get a List of Customer objects, given a customer's last and
     * first names
     *
     * @param lastName The customer's last name
     * @param firstName The customer's first name
     * @return a List of Customers with that first and last name,
     * or null if no such customer exists
     */
    public List<Customer> getCustomer (String lastName, String firstName) {
        return null;  // Stub
    }

    /** Return a List of a given customer's accounts (if any)
     *
     * @param customerId The Customer ID who's account list is desired.
     * @return a List of the accounts of that customer, if any.
     */
    public List<Account> getCustomersAccounts (String customerId) {
        return null;  // Stub
    }
}
