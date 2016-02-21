package hiromitest.sample;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;


@RunWith(Enclosed.class)
public class NumberUtilTest {
/**
    正の整数同士で足す場合
    1-1. 1ケタ同士の足し算
    1-2. 1ケタと2ケタの整数の足し算
    ゼロがあった場合
    2-1. 0 と正の整数での足し算
    2-2. 0 と負の整数での足し算
    負の整数同士で足す場合
    3-1. 1ケタ同士の足し算
    3-2. 1ケタと2ケタの整数の足し算
 */
    public static class 正の整数同士の場合 {

        @Test
        public void ひとケタ同士の足し算() throws Exception {
            // Exercise
            int actual = NumberUtil.add(1, 2);
            // Verify
            assertThat(actual, is(3));
        }

        @Test
        public void ひとケタとふたケタの足し算() throws Exception {
            // Exercise
            int actual = NumberUtil.add(1, 10);
            // Verify
            assertThat(actual, is(11));
        }
    }

    public static class ゼロが含んだ場合 {

        @Test
        public void ゼロと正の整数の足し算() throws Exception {
            // Exercise
            int actual = NumberUtil.add(1, 0);
            // Verify
            assertThat(actual, is(1));
        }

        @Test
        public void ゼロと負の整数の足し算() throws Exception {
            // Exercise
            int actual = NumberUtil.add(0, -1);
            // Verify
            assertThat(actual, is(-1));
        }
    }

    public static class 負の整数同士の場合 {

        @Test
        public void ひとケタ同士の足し算() throws Exception {
            // Exercise
            int actual = NumberUtil.add(-1, -2);
            // Verify
            assertThat(actual, is(-3));
        }

        @Test
        public void ひとケタとふたケタの足し算() throws Exception {
            // Exercise
            int actual = NumberUtil.add(-1, -10);
            // Verify
            assertThat(actual, is(-11));
        }
    }
}
