import accounts.*;

import java.lang.annotation.Inherited;
import java.util.Scanner;

public class Engine {

    public void run() {
        Scanner keyboard = new Scanner(System.in);
        Bank bank = new Bank();

        boolean isRunning = true;

        while (isRunning) {
            System.out.print("> ");
            String userInput = keyboard.nextLine();
            String[] userInputArray = userInput.toLowerCase().trim().split(" ");

            switch (userInputArray[0]) {
                case "exit" -> isRunning = false;
                case "create" -> {
                    if (userInputArray[1].equals(AccountType.CHECKING.name())) {
                        bank.addAccount(new CheckingAccount(userInputArray[2].substring(0, 1).toUpperCase() +
                                userInputArray[2].substring(1)));
                    } else {
                        bank.addAccount(new SavingsAccount(userInputArray[2].substring(0, 1).toUpperCase() +
                                userInputArray[2].substring(1)));
                    }
                }

                case "deposit" -> {
                    for (BankAccount bankAccount : bank.getAccountList()) {
                        if (bankAccount.getOwnerName().equalsIgnoreCase(userInputArray[1])) {
                            bankAccount.deposit(Double.parseDouble(userInputArray[2]));
                        }
                    }
                }

                case "withdraw" -> {
                    for (BankAccount bankAccount : bank.getAccountList()) {
                        if (bankAccount.getOwnerName().equalsIgnoreCase(userInputArray[1])) {
                            bankAccount.withdraw(Double.parseDouble(userInputArray[2]));
                        }
                    }
                }
                case "interest" -> {
                    for (BankAccount bankAccount : bank.getAccountList()) {
                        if (bankAccount.getOwnerName().equalsIgnoreCase(userInputArray[1])) {
                            ((InterestBearing) bankAccount).applyInterest();
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
            }

        }
    }

}
