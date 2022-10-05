class Main{
    static void myMethod(){
        System.out.println("자바가 재밌습니다.");
        }
    static void myMethod2(String fname){   //파라미터, 매개변수 - 받아오는 값
        System.out.println(fname + "Adams");
        }

    static void myMethod3(String name, int age){
        System.out.println(name + age + "입니다");
        }

    static void myMethod4(int age){
        if(age>18){
            System.out.println("출입이 가능합니다.");
        }else{
            System.out.println("출입이 불가능합니다.");
        }
    }

    public static void main(String[] args){
        myMethod();
        String a = "하이";
        myMethod2(a);
        myMethod2("안녕");

    //Method를 활용하여 여러분의 가족 이름과 나이를 파라미터로 받아와 출력하세요.

        myMethod3("아버지", 59);
        myMethod3("어머니",58);
        myMethod3("동생", 30);

        myMethod4(11);

//        int[] cAge = {18, 15, 19 ,50, 15, 125, 55, 5, 8, 17} ;
//        for(int i=0; i< cAge.length; i++){
//            System.out.print(cAge[i] + "세는 ");
//            myMethod4(cAge[i]);
//        }

        int[] rAge = new int[10];
            for(int j = 0; j< rAge.length; j++){
            rAge[j] = (int) (Math.random() *100);
        }

        for(int k=0; k < rAge.length; k++){
            System.out.print(rAge[k] + "세는 ");
            myMethod4(rAge[k]);
        }
    }
}