public class Count {

    //입력되는 값 선언
    private double a;
    private double b;

    //입력되는 값 get, set
    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    //출력되는 값
    public double getPlus() {
        double plus = 0.0;
        plus = getA() + getB();
        return plus;
    }

    public double getSubtract() {
        double subtract = 0.0;
        subtract = getA() - getB();
        return subtract;
    }

    public double getMultiply() {
        double multiply = 0.0;
        multiply = getA() * getB();
        return multiply;
    }

    public double getDivide() {
        double divide = 0.0;
        if (getB() == 0) {
            divide = 0.0;
            System.out.println("invalid number");
        } else {
            divide = getA() / getB();
        }
        return divide;
    }
}

