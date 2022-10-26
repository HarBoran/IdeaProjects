public class Main {
    public static void main(String[] args) {

        //Object화가 가능하다
        Integer myInt = 5;
        Double myDouble = 5.99;
        Character myChar = 'A';

        // 자료형 선언과 차이가 없다
        System.out.println(myInt);
        System.out.println(myDouble);
        System.out.println(myChar);

//        java: int cannot be dereferenced
//        역참조가 불가능하다
//        int myInt = 5;
//        double myDouble =5.99;
//        char myChar = 'A';

        System.out.println(myInt.intValue());
        System.out.println(myDouble.doubleValue());
        System.out.println(myChar.charValue());

//        java: int cannot be dereferenced
//        int myInt2 = 100;
//        String mtString= myInt2.toString();

        Integer myInt2 = 100;
        String myString = myInt2.toString();
        System.out.println(myString);
    }
}