package sample;

import java.util.ArrayList;

public class ArabicNumbers extends Numbers{
    private String[] expressionParts;
    private int arabicResult;

    public ArabicNumbers(String[] expressionParts) {
        this.expressionParts = expressionParts;
    }

    @Override
    public void convertationRomanToArabic() {
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

    @Override
    public void displayResult() {
        System.out.println("Output:");
        System.out.println(arabicResult);
    }
}
