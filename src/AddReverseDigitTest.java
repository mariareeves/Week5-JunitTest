import static org.junit.Assert.*;
import org.junit.Test;
import java.util.LinkedList;
import java.util.List;

public class AddReverseDigitTest {

    @Test
    public void testAddTwoNumbers() {
        AddReverseDigit adder = new AddReverseDigit();

        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(3);
        l1.add(2);
        l1.add(1);

        LinkedList<Integer> l2 = new LinkedList<>();
        l2.add(6);
        l2.add(5);
        l2.add(4);

        LinkedList<Integer> expected = new LinkedList<>();
        expected.add(9); // 3 + 6 = 9
        expected.add(7); // 2 + 5 = 7
        expected.add(5); // 1 + 4 = 5

        LinkedList<Integer> result = adder.addTwoNumbers(l1, l2);

        // Check that the result matches the expected value
        assertEquals(expected, result);
    }

    @Test
    public void testAddTwoNumbersWithCarry() {
        AddReverseDigit adder = new AddReverseDigit();

        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(9);
        l1.add(9);
        l1.add(9);

        LinkedList<Integer> l2 = new LinkedList<>();
        l2.add(1);

        LinkedList<Integer> expected = new LinkedList<>();
        expected.add(0); // 9 + 1 = 10, carry 1
        expected.add(0); // 9 + 0 (carry) + 0 (l2 exhausted) = 9, carry 0
        expected.add(0); // 9 + 0 (carry) + 0 (l2 exhausted) = 9, carry 0
        expected.add(1); // 0 (carry) + 0 (l1 exhausted) + 1 (l2 exhausted) = 1, carry 0

        LinkedList<Integer> result = adder.addTwoNumbers(l1, l2);

        // Check that the result matches the expected value
        assertEquals(expected, result);
    }
}
