package FifthTask;

import FirstTask.NumberProcessing;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FifthTaskMain {
    public static void Start() {
        int N = GetNumberFromConsole("Enter N: ");
        if (N < 0 || N > 100){
            System.out.print("Incorrect input!");
            return;
        }
        List<Integer> palindromes = NumberProcessing.GetPalindromes(0, N);
        System.out.print("Number of palindromes = " + palindromes.size() + "\n");
        System.out.print(Arrays.toString(palindromes.toArray()));
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
