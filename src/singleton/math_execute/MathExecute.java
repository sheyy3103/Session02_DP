package singleton.math_execute;

public class MathExecute {
    private static MathExecute instance;

    private MathExecute() {
    }

    public static MathExecute getInstance() {
        if (instance == null)
            instance = new MathExecute();
        return instance;
    }


    public Integer summation(int a, int b) {
        return a + b;
    }

    public Integer subtraction(int a, int b) {
        return a - b;
    }

    public Integer multiplication(int a, int b) {
        return a * b;
    }

    public Float division(int a, int b) {
        return (float) a / b;
    }
}
