import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

public class ReversePolishNotationCalculatorTest {

  ReversePolishNotationCalculator calculator;

  @BeforeEach
  void setUp() {
    calculator = new ReversePolishNotationCalculator();
  }

  @Test
  public void shouldCalculateAddition() {
    int result = calculator.calculatePolishNotation("3 4 +");
    assertEquals(7, result);
  }
}