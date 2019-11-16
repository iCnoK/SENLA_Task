package ThirdTask;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringProcessing {
    public static int GetNumberOfWords(String sentence){
        String[] words = ParseStringBySpaces(sentence);
        return words.length;
    }

    public static String[] Sort(String[] words){
        String[] result = words.clone();
        Arrays.sort(result);
        return result;
    }

    public static String[] FirstLetterToUpper(String[] words){
        String[] resultWords = new String[words.length];
        for (int i = 0; i < words.length; i++){
            resultWords[i] = words[i].substring(0,1).toUpperCase() + words[i].substring(1);
        }
        return resultWords;
    }

    public static String GetStringFromArray(String[] array){
        String result = Arrays.toString(array);
        result = result.substring(1, result.length() - 1);
        return result;
    }

    public static String[] ParseStringBySpaces(String sentence){
        return sentence.split(" ");
    }

    public static int GetNumberOfMatches(String text, String word){
        String textCopy = text.toLowerCase();
        String wordCopy = word.toLowerCase();
        Pattern pattern = Pattern.compile(wordCopy);
        Matcher matcher = pattern.matcher(textCopy);
        int counter = 0;
        while(matcher.find()){
            counter++;
        }
        return counter;
    }
}
