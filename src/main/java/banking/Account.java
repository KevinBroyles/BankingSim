package banking;

import java.time.*;
import java.util.*;
import java.util.stream.Collectors;

/**
 *
 * @author wpollock
 */
public abstract class Account implements Comparable<Account> {
    private static int nextId = 1;

    protected final Customer customer;
    protected final String accountId;
    protected String description;
    protected final LocalDateTime creationDate;
    // protected StatementCycle statementCycle; // An enum representing any
    //                                          // possible statement cycle
    protected double balance;
    protected List<Transaction> transactions = new ArrayList<>();

    /**
     * @param cust Customer owning this account
     * @param initialBalance Current balance
     * @param accountDescription A description
     */
    public Account (Customer cust, double initialBalance,
            String accountDescription) {
        this.customer = cust;
        this.creationDate = LocalDateTime.now();
        this.accountId = "";
        // Stub
    }

    /**
     * @param amount The amount to deposit
     */
    public abstract void deposit (double amount);

    /**
     * If the account doesn't have sufficient funds for the specified
     * amount, an insufficient funds fee (penalty) is charged on the
     * account.
     * @param amount The amount to withdraw
     */
    public abstract void withdraw (double amount);

    /** Transfer funds between two accounts of a single customer.
     *
     * @param fromAccount The source of the funds
     * @param toAccount The account in which the funds will be deposited
     * @param amount The amount to transfer
     */
    public static void transfer (Account fromAccount, Account toAccount,
            double amount) {
        // Stub
    }

    /**
     * @return The description for this account
     */
    public String getAccountDescription () {
        return null;  // Stub
    }

    /**
     * @param accountDescription The replacement description of this account
     */
    public void setAccountDescription (String accountDescription) {
        // Stub
    }

    /**
     * @return The current account balance
     */
    public double getBalance () {
        return 0.00;  // Stub
    }

    /**
     * @return read-only view of the account's transaction list
     */
    public List<Transaction> getTransactions () {
        return null;  // Stub
    }

    /**
     * @param transactionId  The id of the transaction to search for
     * @return the matching transaction
     * @throws IllegalArgumentException when no such transaction exists
     */
    public Transaction getTransaction (int transactionId) {
        return null;  // Stub
    }

    /**
     * @return Account's ID
     */
    public String getAccountId () {
        return null;  // Stub
    }

    /**
     * @return the customer who owns this account
     */
    public String getCustomerId () {
        return null;  // Stub
    }

    /**
     * @return The date and time the account was created.
     */
    public LocalDateTime getAccountCreationDate () {
        return null;  // Stub
    }

    @Override
    public int hashCode () {
        return 0;  // Stub
    }

    @Override
    public boolean equals (Object obj) {
        return false;  // Stub
    }

    @Override
    public int compareTo (Account other) {
        return 1;  // Stub
    }

    @Override
    public String toString () {
        return null;  // Stub
    }
}
