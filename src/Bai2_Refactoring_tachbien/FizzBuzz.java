package Bai2_Refactoring_tachbien;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

public class FizzBuzz {
    public static String fizzBuzz(int number) {
        boolean isFizz = number % 3 == 0;
        boolean isBuzz = number % 5 == 0;
        if (isFizz && isBuzz)
            return "FizzBuzz";
        if (isFizz)
            return "Fizz";
        if (isBuzz)
            return "Buzz";
        return number + "";
    }
}
