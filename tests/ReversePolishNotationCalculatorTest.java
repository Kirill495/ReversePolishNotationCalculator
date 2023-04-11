import org.junit.Before;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ReversePolishNotationCalculatorTest {

  ReversePolishNotationCalculator calculator;

  @Before
  public void setUp() {
    calculator = new ReversePolishNotationCalculator();
  }

  @Test
  public void shouldCalculateAddition() {
    int result = calculator.calculatePolishNotation("30   40   +   ");
    assertEquals(70, result);
  }

  @Test
  public void shouldCalculateAdditionOfBothPositiveNumbers() {
    int result = calculator.calculatePolishNotation("3 4 +");
    assertEquals(7, result);
  }

  @Test
  public void shouldCalculateAdditionOfPositiveAndNegativeNumbers() {
    int result = calculator.calculatePolishNotation("100 -40 +");
    assertEquals(60, result);
  }

  @Test
  public void shouldCalculateAdditionOfBothNegativeNumbers() {
    int result = calculator.calculatePolishNotation("-100 -40 +");
    assertEquals(-140, result);
  }

  @Test
  public void shouldCalculateSubtractionOfBothPositiveNumbers() {
    int result = calculator.calculatePolishNotation("10 4 -");
    assertEquals(6, result);
  }

  @Test
  public void shouldCalculateSubtractionOfPositiveAndNegativeNumbers() {
    int result = calculator.calculatePolishNotation("10 -4 -");
    assertEquals(14, result);
  }

  @Test
  public void shouldCalculateSubtractionOfBothNegativeNumbers() {
    int result = calculator.calculatePolishNotation("-10 -4 -");
    assertEquals(-6, result);
  }

  @Test
  public void shouldCalculateMultiplicationOfBothPositiveNumbers() {
    int result = calculator.calculatePolishNotation("10 4 *");
    assertEquals(40, result);
  }

  @Test
  public void shouldCalculateMultiplicationOfPositiveAndNegativeNumbers() {
    int result = calculator.calculatePolishNotation("10 -4 *");
    assertEquals(-40, result);
  }

  @Test
  public void shouldCalculateMultiplicationOfBothNegativeNumbers() {
    int result = calculator.calculatePolishNotation("-10 -4 *");
    assertEquals(40, result);
  }
}