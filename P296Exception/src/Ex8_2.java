class Ex8_2 {
    public static void main(String[] args){
        System.out.println(1);
        try{
            System.out.println(0/0);
            System.out.println(2); //실행되지 않음
        } catch (ArithmeticException ae) { //런타임 예외 (수학적 에러가 날경우 실행)
            System.out.println(3);
        }
        System.out.println(4);
    }
}
