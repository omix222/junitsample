package hiromitest.sample;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.experimental.runners.Enclosed;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Enclosed.class)
public class RangeTestWithParameterizedTest{

    @RunWith(Enclosed.class)
    public static class Rangeがマイナス5_1から5_1で {

        static Range sut = new Range(-5.1, 5.1);

        @RunWith(Theories.class)
        public static class 範囲外の場合 {

            @DataPoints
            public static double[] VALUES = {-5.2, 5.2,999999};

            @Theory
            public void containsはfalseを返す(double value) throws Exception {
                // Verify
                assertThat("values=" + value, sut.contains(value), is(false));
            }
        }

        @RunWith(Theories.class)
        public static class 範囲内の場合 {

            @DataPoints
            public static double[] VALUES = {-5.1, 5.1};

            @Theory
            public void containsはtrueを返す(double value) throws Exception {
                // Verify
                assertThat("values=" + value, sut.contains(value), is(true));
            }
        }
    }

    @RunWith(Enclosed.class)
    public static class Rangeが0から10_5で {

        static Range sut = new Range(0.0, 10.5);

        @RunWith(Theories.class)
        public static class 範囲外の場合 {

            @DataPoints
            public static double[] VALUES = {-0.1, 10.6};

            @Theory
            public void containsはfalseを返す(double value) throws Exception {
                // Verify
                assertThat("values=" + value, sut.contains(value), is(false));
            }
        }

        @RunWith(Theories.class)
        public static class 範囲内の場合 {

            @DataPoints
            public static double[] VALUES = {0.0, 10.5};

            @Theory
            public void containsはtrueを返す(double value) throws Exception {
                // Verify
                assertThat("values=" + value, sut.contains(value), is(true));
            }
        }
    }

}