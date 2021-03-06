package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CheckTest {
    @Test
    public void whenDataMonoByTrueThenTrue() {
        boolean[] input = new boolean[] {true, true, true};
        boolean result = Check.mono(input);
        assertThat(result, is(true));
    }

    @Test
    public void whenDataNotMonoByTrueThenFalse() {
        boolean[] input = new boolean[] {true, false, true};
        boolean result = Check.mono(input);
        assertThat(result, is(false));
    }

    @Test
    public void whenDataNotMonoByTrueThenFalse3() {
        boolean[] input = new boolean[] {true, false, true, false};
        boolean result = Check.mono(input);
        assertThat(result, is(false));
    }

    @Test
    public void whenDataNotMonoByTrueThenFalse4() {
        boolean[] input = new boolean[] {false, false, false, false};
        boolean result = Check.mono(input);
        assertThat(result, is(true));
    }
}