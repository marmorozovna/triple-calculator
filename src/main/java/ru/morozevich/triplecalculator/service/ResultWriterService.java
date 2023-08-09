package ru.morozevich.triplecalculator.service;

public class ResultWriterService {
    public static void printResult(int num1, int num2, int result, String operationName) {
        System.out.println("Число 1:" + num1 + " Число 2:" + num2 + " Результат:" + result + " Выполненное действие:" + operationName);
    }
}
