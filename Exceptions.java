package sample;

import java.util.ArrayList;

public class Exceptions {

    public static void methodExceptions(ArrayList<String> arabicNumbers, ArrayList<String> romanNumbers,
                                       ArrayList<String> actions, String[] expressionParts)
            throws ScannerException {

        if (!((romanNumbers.contains(expressionParts[0]) && romanNumbers.contains(expressionParts[2]))
                || (arabicNumbers.contains(expressionParts[0]) && arabicNumbers.contains(expressionParts[2])))) {
            throw new ScannerException("Вы ввели символ или число не соответствующие заданным условиям!");
        }

        if (!actions.contains(expressionParts[1])) {
            throw new ScannerException("Вы указали действие недопустимое для работы с числами!");
        }
    }
}

