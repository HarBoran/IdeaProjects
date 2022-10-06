class Ex7_11 {
    public static void main(String[] args){
        Child3 c = new Child3();
        c.method1();
        c.method2();
        MyInterface.staticMethod();
        MyInterface2.staticMethod();
//      c.staticMethod();
//      스태틱 매소드는 참조변수를 통해 불러올수 없다.
//      MyInterface2.method1();
//      스태틱 매소드가 아닌 매소드는 구현화 하지 않고 불러 올수 없다.
    }
}

class Child3 extends Parent3 implements MyInterface, MyInterface2 {
    public void method1() {
        System.out.println("method1() in Child3");
    }
}

class Parent3 {
    public void method1() {
        System.out.println("method1() in Parent3");
    }
    public void method2(){
        System.out.println("method2() in Parent3");
    }
}

interface MyInterface {
    default void method1() {
        System.out.println("method1() in MyInterface");
    }

    default void method2() {
        System.out.println("method2() in MyInterface");
    }

    static void staticMethod() {
        System.out.println("staticMethod() in MyInterface");
    }
}

interface MyInterface2{
    default void method1() {
        System.out.println("method1() in MyInterface2");
    }

    static void staticMethod() {
        System.out.println("staticMethod() in MyInterface2");
    }
}