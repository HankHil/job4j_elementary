package ru.job4j.converter;

/**
 *  Class клаасс для перевода рубли в доллары или евро
 *  @author kolpakov
 *  @since 11.04.2020
 */

public class Converter {

    /**
     *
     * @param value количество рублей
     * @return количество евро
     */

    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    /**
     *
     * @param value количество рублей
     * @return количество долларов
     */

    public static int rubleToDollar(int value) {
        int rsl = value / 60; // формула перевода рублей в доллоры.
        return rsl;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        int dollar = Converter.rubleToDollar(180);
        System.out.println("180 rubles are " + dollar + " dollar.");
        int in = 140;
        int expected = 2;
        int out = rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);
        int in2 = 240;
        int expected2 = 4;
        int out2 = rubleToDollar(in2);
        boolean passed2 = expected2 == out2;
        System.out.println("240 rubles are 4. Test result : " + passed2);
    }
}