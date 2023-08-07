package ru.morozevich.triplecalculator._main;

import static ru.morozevich.triplecalculator.service.ResultWriterService.printResult;
import static ru.morozevich.triplecalculator.util.Calculator.*;

public class _Main {
    public static void main(String[] args) {
        int x = 7;
        int y = 8;
        int result = sum(x, y);
        printResult(x, y, result, "сложение");
        result = deduct(x, y);
        printResult(x, y, result, "вычитание");
        result = multiply(x, y);
        printResult(x, y, result, "умножение");
    }
}
