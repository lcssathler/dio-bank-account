package domains;

import java.math.BigDecimal;

public class BankAccount {
    private int accountNumber;
    private String branchNumber;
    private String clientName;
    private BigDecimal balance;

    public BankAccount(int accountNumber, String branchNumber, String clientName, BigDecimal balance) {
        this.accountNumber = accountNumber;
        this.branchNumber = branchNumber;
        this.clientName = clientName;
        this.balance = balance;
    }

    public String showInfo() {
        return String.format("Hello, %s! Thank you for get a account on our bank. Your branch account is '%s', account number '%d' and your balance '$%g' is available for withdrawal", clientName, branchNumber, accountNumber, balance);
    }
}
