package FourthTask;

import ThirdTask.StringProcessing;

import java.util.Scanner;

public class FourthTaskMain {
    public static void Start() {
        System.out.print("Enter sentence: ");
        Scanner inputSentence = new Scanner(System.in);
        String sentence = inputSentence.nextLine();
        System.out.print("Enter word: ");
        Scanner inputWord = new Scanner(System.in);
        String word = inputWord.nextLine();

        System.out.print("Number of coincidences = " + StringProcessing.GetNumberOfMatches(sentence, word));
    }
}
