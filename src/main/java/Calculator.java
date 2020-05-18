public class Calculator {

    public int sum(int... numbers) {
        if (numbers == null) {
            return 0;
        }

        var result = 0;
        for (int number : numbers) {
            result += number;
        }
        return result;
    }

    public int multiply(int... numbers)
    {
        if (numbers == null) {
            return 0;
        }
        var result = 1;
        for (int number : numbers) {
            result *= number;
        }
        return result;
    }
}
