package BasicChallenges01.C_Calculator;

public class CalculatorTest {

    public static void main(String[] args)  {
        int a = 1;
        int b = 3;

        Calculator calc = new Calculator(a, b);

        System.out.printf("%d + %d = %d%n", a, b, calc.add());
        System.out.printf("%d - %d = %d%n", a, b, calc.subtract());
        System.out.printf("%d * %d = %d%n", a, b, calc.multiply());
        System.out.printf("%d / %d = %d%n", a, b, calc.divide());

        try {
            System.out.println(calculate(a, b, 'a'));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static int calculate(int a, int b, char operator) throws Exception {
        switch (operator) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                return a / b;
            default:
                throw new Exception("Invalid operator");
        }
    }



}
