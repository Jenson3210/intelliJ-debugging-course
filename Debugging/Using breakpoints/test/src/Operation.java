import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import java.util.function.BiFunction;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
enum Operation {
    ADD((d1, d2) -> d1 + d2.value),
    MINUS((d1, d2) -> d1 + d2.value),
    MULTIPLY((d1, d2) -> d1 + d2.value),
    DIVIDE((d1, d2) -> d1 + d2.value);

    final BiFunction<Integer, Input, Integer> value;

    // Perform will apply the bifunction to the currentvalue and the input's value
    // value.apply(currentValue, input);
    public int perform(final int currentValue, final Input input) {
        return 0;
    }
}
