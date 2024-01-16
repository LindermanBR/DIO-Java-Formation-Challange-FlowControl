import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Enter the first parameter");
        int parameterOne = terminal.nextInt();
        System.out.println("Enter the second parameter");
        int parameterTwo = terminal.nextInt();

        try {
            count(parameterOne, parameterTwo);
        } catch (InvalidParametersException exception) {
            System.out.println("The second parameter must be greater than the first");
        }
        terminal.close();
    }

    static void count(int parameterOne, int parameterTwo) throws InvalidParametersException {
        if (parameterOne > parameterTwo) {
            throw new InvalidParametersException("The second parameter must be greater than the first");
        }

        int count = parameterTwo - parameterOne;
        for (int i = 1; i <= count; i++) {
            System.out.println("Printing the number " + i);
        }
    }
}
