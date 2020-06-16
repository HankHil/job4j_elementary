package ru.job4j.array;

/**
 * проверить. что массив word имеет последние элементы одинаковые с post
 */
public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        for (int index = word.length - 1; index >= word.length - post.length; index--) {
            if (word[index] != post[index - (word.length - post.length)]) {
                result = false;
                break;
            }
    }
        return result;
    }
}