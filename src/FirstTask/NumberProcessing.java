package FirstTask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.lang.Math.sqrt;

public class NumberProcessing {

    public static boolean IsEven(int number) {
        return number % 2 == 0;
    }

    public static boolean IsPrime(int number) {
        if (number == 1) {
            return false;
        }
        for (int i = 2; i < sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean IsComposite(int number) {
        if (number == 1) {
            return false;
        }
        return !IsPrime(number);
    }

    public static int NOD(int firstNum, int secondNum)
    {
        if (firstNum != 0) {
            return NOD(secondNum % firstNum, firstNum);
        }
        else {
            return secondNum;
        }
    }

    public static int NOK(int firstNum, int secondNum)
    {
        return (firstNum / NOD(firstNum, secondNum)) * secondNum;
    }

    public static List<Integer> GetPalindromes(int begin, int end){
        List<Integer> palindromes = new ArrayList<Integer>();
        for (int i = begin; i < end; i++) {
            if (IsPalindrome(i)){
                palindromes.add(i);
            }
        }
        return palindromes;
    }

    private static boolean IsPalindrome(int number){
        int temp = number;
        int mirrorNumber = 0;
        while (temp != 0)
        {
            mirrorNumber = mirrorNumber * 10 + temp % 10;
            temp /= 10;
        }
        if (number == mirrorNumber){
            return true;
        }
        else{
            return false;
        }
    }
}
