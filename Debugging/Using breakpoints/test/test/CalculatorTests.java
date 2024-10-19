import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

public class CalculatorTests {

  @Test
  public void OnePlusOneIsTwo() {
    List<Calculation> calculations = new ArrayList<>();
    calculations.add(new Calculation(Input.ONE, Operation.ADD));
    calculations.add(new Calculation(Input.ONE, Operation.ADD));

    Calculator calculator = new Calculator();
    Assertions.assertDoesNotThrow(() -> calculator.calculateAndValidate(calculations, 2));
  }

  @Test
  public void OnePlusNineIsTen() {
    List<Calculation> calculations = new ArrayList<>();
    calculations.add(new Calculation(Input.ONE, Operation.ADD));
    calculations.add(new Calculation(Input.NINE, Operation.ADD));

    Calculator calculator = new Calculator();
    Assertions.assertDoesNotThrow(() -> calculator.calculateAndValidate(calculations, 10));
  }

  @Test
  public void CanHandleMultipleOperations() {
    List<Calculation> calculations = new ArrayList<>();
    calculations.add(new Calculation(Input.EIGHT, Operation.MINUS));
    calculations.add(new Calculation(Input.NINE, Operation.ADD));
    calculations.add(new Calculation(Input.TWENTY, Operation.MULTIPLY));
    calculations.add(new Calculation(Input.FIVE, Operation.DIVIDE));

    Calculator calculator = new Calculator();
    Assertions.assertDoesNotThrow(() -> calculator.calculateAndValidate(calculations, 4));
  }

  @Test
  public void DivideByZeroThrowsException() {
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
