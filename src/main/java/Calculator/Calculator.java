package Calculator;

public class Calculator implements ICalculator{
    @Override
    public int sum(int a, int b) {
        return a + b;
    }

    @Override
    public int subtraction(int a, int b) {
        return a - b;
    }

    @Override
    public int multiplication(int a, int b) {
        return a * b;
    }

    @Override
    public int division(int a, int b) throws IllegalArgumentException {
        if (b == 0) {
            throw new IllegalArgumentException("Error: Division by zero!");
        }
        return a / b;
    }

    @Override
    public double squaring(int a) {

        return Math.sqrt(a);
    }

    @Override
    public double sin(double a) {
        double sin = Math.sin(a);
        return Math.round(sin * 100) / 100.0;
    }

    @Override
    public double cos(double a) {
        double cos = Math.cos(a);
        return Math.round(cos * 100) / 100.0;
    }

    @Override
    public double tan(double a) {
        double tan = Math.tan(a);
        return Math.round(tan * 100) / 100.0;
    }
}
