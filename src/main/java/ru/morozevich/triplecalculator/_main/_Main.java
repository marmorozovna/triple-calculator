package ru.morozevich.triplecalculator._main;

import ru.morozevich.triplecalculator.service.ResultWriterService;
import ru.morozevich.triplecalculator.util.Calculator;

import java.util.Scanner;

public class _Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        ResultWriterService.printResult(num1, num2, Calculator.sum(num1, num2), "сложение");
        ResultWriterService.printResult(num1, num2, Calculator.deduct(num1, num2), "вычитание");
        ResultWriterService.printResult(num1, num2, Calculator.multiply(num1, num2), "умножение");
    }
}
