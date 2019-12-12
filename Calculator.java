package sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Calculator {
    private static boolean roman = false; // условие ввода римских цифр
    private static ArrayList<String> romanNumbers = new ArrayList<String>(
            Arrays.asList("I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"));
    private static ArrayList<String> romanDecimal = new ArrayList<String>(
            Arrays.asList("X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC", "C"));
    private static ArrayList<String> arabicNumbers = new ArrayList<String>(
            Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "10"));
    private static ArrayList<String> actions = new ArrayList<String>(
            Arrays.asList("+", "-", "*", "/"));

    public static void main(String[] args) throws ScannerException {
        System.out.println("Input:");
        Scanner scanner = new Scanner(System.in);
        String expression = scanner.nextLine(); // считываем введенную строку (выражение)

        String[] expressionParts = expression.split(" "); // создаем массив из введеннной строки (разбиваем строку)

        Exceptions.methodExceptions(arabicNumbers, romanNumbers, actions, expressionParts); // вызываем исключения

        roman = Identifier.methodIdentifier(romanNumbers, expressionParts, roman);

        if (roman) {
            RomanNumbers romans = new RomanNumbers(expressionParts, arabicNumbers, romanNumbers, romanDecimal);
            romans.convertationRomanToArabic();
            romans.calculation();
            romans.convertationArabicToRoman();
            romans.displayResult();
        } else {
            ArabicNumbers arabics = new ArabicNumbers(expressionParts);
            arabics.calculation();
            arabics.displayResult();
        }
    }
}