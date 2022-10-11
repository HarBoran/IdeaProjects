class Outer{
    static class Inner{
        int iv = 200;
    }
}

public class Exercise7_7 {
    public static void main(String[] args){
//      Outer o = new Outer();
//      Outer.Inner i = o.new Inner();
//      내부 스태틱 클래스는 외부클래스를 먼저 생성하지 않아도 된다
//      내부클래스가 외부클래스의 맴버와 같이 간주됨
        Outer.Inner i = new Outer.Inner();
        System.out.println(i.iv);
        System.out.println(Outer.Inner.iv);
    }
}
