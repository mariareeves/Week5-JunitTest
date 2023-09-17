import static org.junit.Assert.*;
import org.junit.Test;

public class BalancedParenthesesTest {
    @Test
    public void testBalancedParentheses1() {
        String testString = "()()";
        assertTrue(BalancedParentheses.hasBalancedParentheses(testString));
    }

    @Test
    public void testBalancedParentheses2() {
        String testString = "(())()";
        assertTrue(BalancedParentheses.hasBalancedParentheses(testString));
    }

    @Test
    public void testUnbalancedParentheses() {
        String testString = ")()((";
        assertFalse(BalancedParentheses.hasBalancedParentheses(testString));
    }

    @Test
    public void testEmptyString() {
        String testString = "";
        assertTrue(BalancedParentheses.hasBalancedParentheses(testString));
    }

    @Test
    public void testNestedParentheses() {
        String testString = "((()))";
        assertTrue(BalancedParentheses.hasBalancedParentheses(testString));
    }

    @Test
    public void testUnmatchedClosingParentheses() {
        String testString = "(()))(";
        assertFalse(BalancedParentheses.hasBalancedParentheses(testString));
    }
}
