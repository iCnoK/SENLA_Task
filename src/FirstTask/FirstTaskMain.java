package FirstTask;

import java.util.Scanner;

public class FirstTaskMain {
    public static void Start() {

        int number = GetNumberFromConsole("Enter integer number: ");
        System.out.print("Is even: " + NumberProcessing.IsEven(number) + "\n");
        System.out.print("Is odd: " + !NumberProcessing.IsEven(number) + "\n");
        System.out.print("Is prime: " + NumberProcessing.IsPrime(number) + "\n");
        System.out.print("Is composite: " + NumberProcessing.IsComposite(number) + "\n");
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
