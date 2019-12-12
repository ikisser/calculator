package sample;

import java.util.ArrayList;

public class RomanNumbers extends Numbers {
    private String[] expressionParts;
    private ArrayList<String> arabicNumbers;
    private ArrayList<String> romanNumbers;
    private ArrayList<String> romanDecimal;
    private String result;
    private int arabicResult;

    public RomanNumbers(String[] expressionParts, ArrayList<String> arabicNumbers,
                        ArrayList<String> romanNumbers, ArrayList<String> romanDecimal) {
        this.expressionParts = expressionParts;
        this.arabicNumbers = arabicNumbers;
        this.romanNumbers = romanNumbers;
        this.romanDecimal = romanDecimal;
    }

    @Override
    public void convertationRomanToArabic() {
        for (int i = 0; i < romanNumbers.size(); i++) {
            if (expressionParts[0].equals(romanNumbers.get(i))) {
                expressionParts[0] = arabicNumbers.get(i);
            }
            if (expressionParts[2].equals(romanNumbers.get(i))) {
                expressionParts[2] = arabicNumbers.get(i);
            }
        }
    }

    @Override
    public void calculation() {
        switch (expressionParts[1]) {
            case "+":
                arabicResult = Integer.parseInt(expressionParts[0]) + Integer.parseInt(expressionParts[2]);
                break;
            case "-":
                arabicResult = Integer.parseInt(expressionParts[0]) - Integer.parseInt(expressionParts[2]);
                break;
            case "*":
                arabicResult = Integer.parseInt(expressionParts[0]) * Integer.parseInt(expressionParts[2]);
                break;
            case "/":
                arabicResult = Integer.parseInt(expressionParts[0]) / Integer.parseInt(expressionParts[2]);
                break;
        }
    }

    public void convertationArabicToRoman() {
        if (arabicResult <= 10) {
            result = romanNumbers.get(arabicResult - 1);
        }

        if ((arabicResult > 10) && (arabicResult < 100)) {
            for (int i = 0; i < romanDecimal.size(); i++) {
                if ((arabicResult - (10 * (i + 1))) == 0) {
                    result = romanDecimal.get(i); //10-ти кратные числа от 20 о 90
                }
                if (((arabicResult - (10 * (i + 1))) > 0) && ((arabicResult - (10 * (i + 1))) < 10)) {
                    result = romanDecimal.get(i) + romanNumbers.get((arabicResult - (10 * (i + 1))) - 1);
                }
            }
        }

        if (arabicResult == 100) {
            result = romanDecimal.get(9);
        }
    }

    @Override
    public void displayResult() {
        System.out.println("Output:");
        System.out.println(result);
    }
}
