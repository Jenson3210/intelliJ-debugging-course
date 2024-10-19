import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        OnePlusOneIsTwo();
        OnePlusNineIsTen();
        CanHandleMultipleOperations();
        DivideByZeroThrowsException();
    }

    public static void OnePlusOneIsTwo() {
        List<Calculation> calculations = new ArrayList<>();
        calculations.add(new Calculation(Input.ONE, Operation.ADD));
        calculations.add(new Calculation(Input.ONE, Operation.ADD));

        Calculator calculator = new Calculator();
        calculator.calculateAndValidate(calculations, 2);
    }
    public static void OnePlusNineIsTen() {
        List<Calculation> calculations = new ArrayList<>();
        calculations.add(new Calculation(Input.ONE, Operation.ADD));
        calculations.add(new Calculation(Input.NINE, Operation.ADD));

        Calculator calculator = new Calculator();
        calculator.calculateAndValidate(calculations, 10);
    }

    public static void CanHandleMultipleOperations() {
        List<Calculation> calculations = new ArrayList<>();
        calculations.add(new Calculation(Input.EIGHT, Operation.MINUS));
        calculations.add(new Calculation(Input.NINE, Operation.ADD));
        calculations.add(new Calculation(Input.TWENTY, Operation.MULTIPLY));
        calculations.add(new Calculation(Input.FIVE, Operation.DIVIDE));

        Calculator calculator = new Calculator();
        calculator.calculateAndValidate(calculations, 4);
    }

    public static void DivideByZeroThrowsException() {
        List<Calculation> calculations = new ArrayList<>();
        calculations.add(new Calculation(Input.ONE, Operation.ADD));
        calculations.add(new Calculation(Input.ZERO, Operation.DIVIDE));

        Calculator calculator = new Calculator();
        try {
            calculator.calculateAndValidate(calculations, 4);
        } catch (ArithmeticException e) {
            return;
        }
        throw new RuntimeException("You shall not pass!");
    }
}
