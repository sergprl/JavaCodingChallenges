package BasicChallenges01.C_Calculator;

public class Calculator {

    private int a;
    private int b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return this.a;
    }

    public int getB() {
        return this.b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }


    public int add() {
        return (this.a + this.b);
    }

    public int subtract() {
        return (this.a - this.b);

    }

    public int multiply() {
        return (this.a * this.b);

    }

    public int divide() {
        return (this.a/this.b);
    }
}
