enum Level{
        Low,
        MEDIUM,
        HIGH
    }

class enumEx3 {
    public static void main(String[] args){
        Level myVar = Level.MEDIUM;
        switch (myVar){
            case Low:
                System.out.println("Low Level");
                break;
            case MEDIUM:
                System.out.println("Medium Level");
                break;
            case HIGH:
                System.out.println("High Level");
                break;
        }
    }
}
