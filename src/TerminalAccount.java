import domains.BankAccount;

import java.math.BigDecimal;
import java.util.Scanner;

public class TerminalAccount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type your account number: ");
        int accountNumber = scanner.nextInt();
        System.out.print("Type your branch number: ");
        String branchNumber = scanner.next();
        System.out.print("Client's name: ");
        String clientName = scanner.next();
        System.out.print("Balance: $");
        BigDecimal balance = scanner.nextBigDecimal();

        BankAccount account = new BankAccount(accountNumber, branchNumber, clientName, balance);

        System.out.println(account.showInfo());
    }
}
