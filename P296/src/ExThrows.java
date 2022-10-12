//Throws 문을 활용하여 18세미만이면 출입이 허용 되지 않는다는
//exception 메세지가 나오게 하시고,
//18세 이상미면 출입니 가능하다는 메세지가 나오도록하세요

public class ExThrows {

    public static void main(String[] agrs) {

        age(20);
//        age(2);
        try {
            age(20);
            age(3);
        } catch (Exception e) {
           // System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("종료");
    }

    static void age(int n) throws ArithmeticException {
        if (n < 18) {
            throw new ArithmeticException("에러 메세지 출입이 허용 되지 않습니다.");
        } else {
            System.out.println("출입이 가능합니다.");
        }
    }
}