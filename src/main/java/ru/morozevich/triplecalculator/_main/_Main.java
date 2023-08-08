package ru.morozevich.triplecalculator._main;

import java.util.Scanner;

import static ru.morozevich.triplecalculator.service.ResultWriterService.printResult;
import static ru.morozevich.triplecalculator.util.Calculator.*;

public class _Main {
    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner (System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int result = sum(x, y);
        printResult(x, y, result, "сложение");
        result = deduct(x, y);
        printResult(x, y, result, "вычитание");
        result = multiply(x, y);
        printResult(x, y, result, "умножение");
    }
}
