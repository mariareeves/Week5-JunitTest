import java.util.LinkedList;

public class AddReverseDigit{

    public LinkedList<Integer> addTwoNumbers(LinkedList<Integer> l1, LinkedList<Integer> l2) {
        LinkedList<Integer> result = new LinkedList<>();
        int carry = 0;

        while (!l1.isEmpty() || !l2.isEmpty() || carry != 0) {
            int x = l1.isEmpty() ? 0 : l1.removeFirst();
            int y = l2.isEmpty() ? 0 : l2.removeFirst();

            int sum = x + y + carry;
            carry = sum / 10;
            result.addLast(sum % 10);
        }

        return result;
    }

    public static void main(String[] args) {
        AddReverseDigit adder = new AddReverseDigit();

        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(3);
        l1.add(2);
        l1.add(1);

        LinkedList<Integer> l2 = new LinkedList<>();
        l2.add(6);
        l2.add(5);
        l2.add(4);

        LinkedList<Integer> result = adder.addTwoNumbers(l1, l2);

        System.out.print("Result: ");
        for (int digit : result) {
            System.out.print(digit + " ");
        }
    }
}
