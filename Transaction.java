package banking;

import java.time.*;

/**
 * @author wpollock
 *
 */
public class Transaction implements Comparable<Transaction> {
    private static int nextID = 1;

    private final int id;
    private final LocalDateTime timestamp;
    private final TransactionType type;
    private final double amount;
    private final String description;
    /**
     * @param type The type of this transaction
     * @param amount The amount of the transaction
     * @param description The description of the transaction.
     *        This may include check numbers, memo, payee, etc.
     */
    public Transaction (TransactionType type, double amount,
            String description) {
        this.id = 1;
        this.type = null;
        this.amount = 0.00;
        this.description = "";
        this.timestamp = LocalDateTime.now();
        // Stub
    }

    /**
     * @return the id
     */
    public int getId () {
        return 0;  // Stub
    }

    /**
     * @return the timestamp for this transaction
     */
    public LocalDateTime getTimestamp () {
        return null;  // Stub
    }

    /**
     * @return the transaction type
     */
    public TransactionType getType () {
        return null;  // Stub
    }

    /**
     * @return the amount of this transaction.
     * Transaction amounts are always positive.
     */
    public double getAmount () {
        return 0.00;  // Stub
    }

    /**
     * @return the description
     */
    public String getDescription () {
        return null;  // Stub
    }

    @Override
    public String toString () {
        return "";  // Stub
    }

    @Override
    public int hashCode () {
        return 1;  // Stub
    }

    @Override
    public boolean equals (Object obj) {
        return false;  // Stub
    }

    @Override
    public int compareTo (Transaction other) {
        return 0;  // Stub
    }

}
