class enumEx2 {
    enum Level1{
        Low,
        MEDIUM,
        HIGH
    }

    //열거형 상수 선언을 편리하게

    public static void main(String[] agrs){
        Level1 myVar = Level1.MEDIUM;
        System.out.println(myVar);

    }
}