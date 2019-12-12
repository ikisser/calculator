package sample;

import java.util.ArrayList;

public abstract class Numbers {
    private String[] expressionParts;
    private ArrayList<String> romanNumbers;
    private String result;

    public abstract void convertationRomanToArabic();

    public abstract void calculation();

    public void convertationArabicToRoman() {
    }

    public abstract void displayResult();
}
