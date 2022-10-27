
//Consumer<Integer>
interface StringFunction{

    //래퍼 클래스
    //타입에 해당하는 데이터를 인수로 전달받아 해당 값을 가지는 객체로 만들어준다.
    //래퍼 클래스 몇수명?? 래퍼클래스 매서드
    //여기서 t를 흔히 Thread의 객체라고 생각할 수 있으나(나도 그랬다) t는 Thread 클래스를 확장한 익명 클래스의 객체이다
    String run(String str);
}

class LambdaEx3 {
    public static void main(String[] args){
        //인터페이스의 실현부, 구체화
        StringFunction exclaim = (s) -> s + "!";
        StringFunction ask = (s) -> s + "?";
        //매서드 실행
        printFormatted("Hello", exclaim);
        printFormatted("Hello", ask);
    }

    public static void printFormatted(String str, StringFunction format) {
        //참조변수  foramt을 통해 매서드 run을 실행함
        String result = format.run(str);
        System.out.println(result);
    }
}
