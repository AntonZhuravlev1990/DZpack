package ru.netology.service;

public class VacationService {

    public int calcVacation(int income, int expenses, int threshold) {
        int balance = 0;
        int vacations = 0;
        for (int month = 0; month < 12; month++) {
            if (balance >= threshold) {
                balance -= expenses;
                balance = balance / 3;
                vacations++;
            } else {
                balance += income - expenses;
            }
        }
        return vacations;

    }
}

