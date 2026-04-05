import accounts.*;

import java.util.Scanner;

public class Engine {
    private boolean isRunning = true;

    public void stopRunning() {
        this.isRunning = false;
    }

    public void run() {
        Scanner keyboard = new Scanner(System.in);
        Bank bank = new Bank();

        while (isRunning) {
            System.out.print("> ");
            String userInput = keyboard.nextLine();
            String[] userInputArray = userInput.toLowerCase().trim().split(" ");
            if(userInputArray[0].equals("exit")){
                System.out.println("Goodbye!");
                stopRunning();
            }else{
            BankService.bankService(userInputArray, bank);
            }
        }
    }
}
