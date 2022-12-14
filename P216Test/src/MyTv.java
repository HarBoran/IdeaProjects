public class MyTv {
    boolean isPowerOn;
    int channel;
    int volume;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    void turnOnOff(){
        isPowerOn =! isPowerOn;
    }

    void volumeUp(){
        if(volume<MAX_VOLUME){
            ++volume;
        }
    }

    void volumeDown(){
        if(volume>MIN_VOLUME){
            ++volume;
        }
    }

    void channelUp(){
        ++channel;
        if(channel>MAX_CHANNEL){
            channel = MIN_CHANNEL;
        }
    }

    void channelDown(){
        --channel;
        if(channel<MIN_CHANNEL){
            channel = MAX_CHANNEL;
        }
    }
} // class TV

class Exercise6_19 {
    public static void main(String[] args){
        MyTv t = new MyTv();

        t.turnOnOff();
        System.out.println(t.isPowerOn);

        t.channel = 100;
        t.volume = 0;
        System.out.println("Ch:" + t.channel + ",Vol:" + t.volume);

        t.channelDown();
        t.volumeDown();
        System.out.println("Ch:" + t.channel + ",Vol:" + t.volume);

        t.volume = 100;
        t.channelUp();
        t.volumeUp();
        System.out.println("Ch:" + t.channel + ",Vol:" + t.volume);
    }
}