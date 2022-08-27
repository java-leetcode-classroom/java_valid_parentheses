import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  private final Solution sol = new Solution();
  @Test
  void isValidExample1() {
    assertTrue(sol.isValid("()"));
  }
  @Test
  void isValidExample2() {
    assertTrue(sol.isValid("()[]{}"));
  }
  @Test
  void isValidExample3() {
    assertFalse(sol.isValid("(]"));
  }
}