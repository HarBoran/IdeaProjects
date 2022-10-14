class Ex8_4 {
    public static void main(String[] args){
        String[] i = new String[5];
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(i[4]);
            System.out.println(0/0);
            System.out.println(4);
        }catch (NullPointerException ne){
            if (ne instanceof NullPointerException){ //형변환 가능 여부 확인
                System.out.println("ture");
            }
            ne.printStackTrace();
            System.out.println("예외메시지 : " + ne.getMessage());
            System.out.println("NullPointerException");
        }catch(ArithmeticException ae) { //ae 참조변수
            if (ae instanceof ArithmeticException){ //형변환 가능 여부 확인
                System.out.println("ture");
            }
            ae.printStackTrace();
            System.out.println(ae.getMessage());
            System.out.println("ArithmeticException");
        }catch(Exception e){
            System.out.println("Exception");
        }
        System.out.println(6);
    }
}