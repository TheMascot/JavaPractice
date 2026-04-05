import accounts.*;

import java.util.InputMismatchException;

public class BankService {

    public static void bankService(String[] userInputArray, Bank bank) {

        try {
            switch (userInputArray[0]) {
                case "create" -> {
                    String userName = userInputArray[2].substring(0, 1).toUpperCase() +
                            userInputArray[2].substring(1);
                    if (userInputArray[1].equals(AccountType.CHECKING.getName())) {
                        bank.addAccount(new CheckingAccount(userName));
                        System.out.println("Account created: " + userName + " (" + AccountType.CHECKING + ")");
                    } else if (userInputArray[1].equals(AccountType.SAVINGS.getName())) {
                        bank.addAccount(new SavingsAccount(userName));
                        System.out.println("Account created: " + userName + " (" + AccountType.SAVINGS + ")");
                    } else {
                        throw new InputMismatchException("Account type is not valid.");
                    }
                }
                case "deposit" -> {
                    for (BankAccount bankAccount : bank.getAccountList()) {
                        if (bankAccount.getOwnerName().equalsIgnoreCase(userInputArray[1])) {
                            bankAccount.deposit(Double.parseDouble(userInputArray[2]));
                            System.out.print("Deposited " + userInputArray[2] + " to " + bankAccount.getOwnerName() + ". ");
                            System.out.println("Balance: " + bankAccount.getBalance());

                        }
                    }
                }
                case "withdraw" -> {
                    for (BankAccount bankAccount : bank.getAccountList()) {
                        if (bankAccount.getOwnerName().equalsIgnoreCase(userInputArray[1])) {
                            bankAccount.withdraw(Double.parseDouble(userInputArray[2]));
                            System.out.print("Withdrew " + userInputArray[2] + " from " + bankAccount.getOwnerName() +
                                    ". ");
                            System.out.println("Balance: " + bankAccount.getBalance());
                        }
                    }
                }
                case "interest" -> {
                    for (BankAccount bankAccount : bank.getAccountList()) {
                        if (bankAccount.getOwnerName().equalsIgnoreCase(userInputArray[1])) {
                            ((InterestBearing) bankAccount).applyInterest();
                            System.out.print("Interest applied. ");
                            System.out.println("New balance: " + bankAccount.getBalance());
                        }
                    }
                }
                case "status" -> {
                    for (BankAccount bankAccount : bank.getAccountList()) {
                        if (bankAccount.getOwnerName().equalsIgnoreCase(userInputArray[1])) {
                            String s = "Name: " + bankAccount.getOwnerName() + " | " +
                                    "Type: " + bankAccount.getAccountType() + " | " +
                                    "Balance: " + bankAccount.getBalance() + " | " +
                                    "Status: " + bankAccount.getAccountStatus();
                            System.out.println(s);
                        }
                    }
                }
                default -> System.out.println("The input was not correct.");
            }
        } catch (Exception e) {
            if (e.getMessage() == null || e.getMessage().isBlank()) {
                System.out.println("Some input was incorrect.");
            } else {
                System.out.println(e.getMessage());
            }
        }

    }

}
