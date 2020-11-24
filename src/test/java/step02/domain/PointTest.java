package step02.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

public class PointTest {

    private static Stream<Boolean> provideHasLineResult() {
        return Stream.of(true, false);
    }

    @DisplayName("생성자")
    @ParameterizedTest
    @MethodSource("provideHasLineResult")
    void test_constructor_of(Boolean hasLine) {
        assertThat(Point.of(hasLine)).isEqualTo(Point.of(hasLine));
    }
}
