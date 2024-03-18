package pl.aziet.creditcard;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class AssertJTest {

    @Test void helloAssertJ() {
        var hello = "Hello World";

        assertThat(hello).containsOnlyDigits();
    }

    @Test
    void testSomeListExpression() {
        var names = Collections.singleton("Alek");

        assertThat(names)
                .isUnmodifiable()
                .hasSize(3)
                .containsAll(Arrays.asList("Alek"));
    }

}
