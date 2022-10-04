class Tv{
    boolean power;
    int channel;

    void power() {power = !power;}
    void channelUP() {channel++;}
    void channelDown() {channel--;}
}

class SmartTv extends Tv{
    boolean caption;
    void displayCaption(String text){
        if(caption==false){
            System.out.println(text);
        }
    }
}

public class Ex7_1 {
    public static void main(String[] args){
        SmartTv stv = new SmartTv();
        stv.channel = 10;
        stv.channelUP();
        System.out.println(stv.channel);
        stv.displayCaption("Hello, World");
        stv.caption = true;
        stv.displayCaption("Hello, Tv");
        stv.power();
        System.out.println(stv.power);

    }
}
