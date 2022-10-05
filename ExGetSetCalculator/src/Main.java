public class Main {
    public static void main(String[] args){

        Count result = new Count();

        result.setA(3.0);
        result.setB(17);

        System.out.println(result.getA() + " + " + result.getB()
                + " = " + result.getPlus());
        System.out.println(result.getA() + " - " + result.getB()
                + " = " + result.getSubtract());
        System.out.println(result.getA() + " * " + result.getB()
                + " = " + result.getMultiply());
        System.out.println(result.getA() + " / " + result.getB()
                + " = " + result.getDivide());
    }
}