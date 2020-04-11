package ru.job4j.loop;



public class Mortgage {
    public int year(int amount, int salary, double percent) {
        int year = 0;
        double credit = amount + (amount * percent / 100);
        while (credit > 0) {
            credit = credit - salary;
            credit = credit + (credit * percent / 100);
            year++;
        }
        return year;
    }
}