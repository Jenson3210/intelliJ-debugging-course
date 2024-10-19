import java.util.List;

public class Calculator {
    public double calculate(List<Calculation> calculations) {
        int value = 0;

        for (Calculation calculation : calculations) {
            value = calculation.calculate(value);
        }

        return value;
    }

    public void calculateAndValidate(List<Calculation> calculations, int expectedResult) {
        if (calculate(calculations) != expectedResult) {
            throw new RuntimeException("Calculation is wrong! Expected result was " + expectedResult);
        }
    }
}
