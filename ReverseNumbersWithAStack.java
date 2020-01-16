import java.util.ArrayDeque;
        import java.util.Scanner;

public class ReverseNumbersWithAStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        ArrayDeque<String> stack = new ArrayDeque<>();

        for (int i = input.length - 1; i >= 0; i--) {
            stack.push(input[i]);
            System.out.printf("%s ", stack.peek());
        }

    }
}
