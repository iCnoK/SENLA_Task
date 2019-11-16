package SecondTask;

import FirstTask.NumberProcessing;

import java.util.Scanner;

public class SecondTaskMain {
    public static void Start() {
        System.out.print("Enter 2 numbers:\n");
        int firstNumber = GetNumberFromConsole("1: ");
        int secondNumber = GetNumberFromConsole("2: ");
        System.out.print("NOD = " + NumberProcessing.NOD(firstNumber, secondNumber) + "\n");
        System.out.print("NOK = " + NumberProcessing.NOK(firstNumber, secondNumber) + "\n");
    }

    private static int GetNumberFromConsole(String message){
        System.out.print(message);
        Scanner input = new Scanner(System.in);
        if (!input.hasNextInt()){
            System.out.print("Incorrect input!\n");
            GetNumberFromConsole(message);
        }
        return input.nextInt();
    }
}
