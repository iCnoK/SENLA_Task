package ThirdTask;

import java.util.Scanner;

public class ThirdTaskMain {
    public static void Start() {
        System.out.print("Enter sentence: ");
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
        String[] words = StringProcessing.ParseStringBySpaces(sentence);

        System.out.print(StringProcessing.GetNumberOfWords(sentence) + "\n");
        String[] sortedWords = StringProcessing.Sort(words);
        System.out.print(StringProcessing.GetStringFromArray(sortedWords) + "\n");
        String[] uppedLettersArray = StringProcessing.FirstLetterToUpper(words);
        System.out.print(StringProcessing.GetStringFromArray(uppedLettersArray) + "\n");
    }
}
