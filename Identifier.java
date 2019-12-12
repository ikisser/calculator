package sample;

import java.util.ArrayList;

public class Identifier {

    public static boolean methodIdentifier(ArrayList<String> romanNumbers, String[] expressionParts, boolean roman) {

        if (romanNumbers.contains(expressionParts[0]) && romanNumbers.contains(expressionParts[2])) {
            roman = true;
        }

        return roman;
    }
}