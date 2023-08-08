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
        printResult(x, y, sum(x, y), "сложение");
        printResult(x, y, deduct(x, y), "вычитание");
        printResult(x, y, multiply(x, y), "умножение");
    }
}
