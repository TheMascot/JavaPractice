import java.util.Scanner;

public class DoWhilePractice {
    public static void main(String[] args) {

//        ***LVL1***
//
//        Write a Java program that:
//        Continuously asks the user to enter an integer.
//        The loop must run at least once.
//
//                The program stops only when the user enters three even numbers in a row.
//                Negative numbers are allowed.
//                Zero counts as even.
//                When the loop ends, print:
//
//                "Program terminated after X inputs."
//                where X is the total number of numbers entered.
//
//        Rules:
//        You must use a do-while loop.
//        You may not use break.
//        You may not use continue.
//        You may not store all inputs (only counters / variables).

//        Scanner keyboard = new Scanner(System.in);
//
//        int allCounter = 0;
//        int correctCounter = 0;
//        int input;
//
//        do {
//            System.out.println("Adjon meg egy páros számot:");
//            input = keyboard.nextInt();
//            allCounter++;
//            if (input % 2 == 0) correctCounter++;
//            else correctCounter = 0;
//
//
//        } while (correctCounter != 3);
//
//        System.out.println("A program " + allCounter + " input után befejeződött.");


//          ***LVL2***
//
//          Write a Java program that:
//              Repeatedly asks the user to enter an integer.
//              The program must use a do-while loop.
//              The loop ends only when the user enters two numbers IN A ROW whose sum is divisible by 7.
//              Zero and negative numbers are allowed.
//              You may not use break, continue, arrays, or collections.
//
//          You may store only:
//              the current and previous number
//              counters / flags
//
//          When the loop ends, print:
//              "Program finished after X inputs."
//          where X is the total number of numbers entered.

//        Scanner keyboard = new Scanner(System.in);
//
//        int input = 0;
//        int prevNum;
//        int counter = 0;
//
//        do {
//            prevNum = input;
//            System.out.println("Adjon meg egy számot:");
//            input = keyboard.nextInt();
//            counter++;
//        }while(counter < 2 || (input + prevNum) % 7 != 0);
//        System.out.println("A program " + counter + " input után fejeződött be.");


//        ***LVL3***
//
//        Write a program that repeatedly asks the user to enter integers.
//        The program should stop only when ALL of the following are true at the same time:
//
//            The user has entered at least 5 numbers,
//            The last 3 numbers entered are strictly increasing,
//            The sum of all entered numbers so far is divisible by 10,
//            At least one negative number has been entered at any point.
//
//        When the program finishes, print:
//            how many numbers were entered,
//            the last 3 numbers,
//            the final sum.
//
//        Important constraints:
//            You must process inputs one by one (no arrays, no collections),
//            You may only keep the minimum necessary state,
//            The stopping condition must be checked in the loop condition (not with break).

        Scanner keyboard = new Scanner(System.in);

        int inputNum = 0;
        int prevNum = 0;
        int prevPrevNum = 0;
        boolean increasing = false;
        int sum = 0;
        boolean haveANegative = false;
        int counter = 0;

        do {
            if(counter == 1){
                prevNum = inputNum;
            }
            else if (counter > 1) {
                prevPrevNum = prevNum;
                prevNum = inputNum;
            }

            System.out.println("Adjon meg egy számot:");
            inputNum = keyboard.nextInt();
            counter++;
            sum += inputNum;
            if(inputNum < 0) haveANegative = true;
            if( counter >= 3 && (inputNum > prevNum && prevNum > prevPrevNum)){
                increasing = true;

            }else increasing = false;

        }while(counter < 5 || !increasing || sum % 10 != 0 || !haveANegative);

        System.out.println(counter + " input után megállt a program.");
        System.out.println("A beírt számok összege: " + sum);
        System.out.println("A három utoljára beírt szám: " + inputNum + " " + prevNum + " és " + prevPrevNum);

    }
}

