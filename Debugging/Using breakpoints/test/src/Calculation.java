import lombok.Value;

@Value
class Calculation {
    Input value;
    Operation operation;

    public int calculate(int currentValue) {
        return operation.perform(currentValue, value);
    }
}
