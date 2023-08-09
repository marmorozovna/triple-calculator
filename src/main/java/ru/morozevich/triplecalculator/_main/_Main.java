package ru.morozevich.triplecalculator._main;

import java.util.Scanner;

import static ru.morozevich.triplecalculator.service.ResultWriterService.printResult;
import static ru.morozevich.triplecalculator.util.Calculator.*;

public class _Main {
    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        printResult(num1, num2, sum(num1, num2), "сложение");
        printResult(num1, num2, deduct(num1, num2), "вычитание");
        printResult(num1, num2, multiply(num1, num2), "умножение");
    }
}
