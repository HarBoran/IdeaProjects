class MyTv {
    private boolean isPowerOn;

    private int channel;
    private int volume;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    int prevChannel;


//    public int getChannel(){}
//        return channel;
//    public void setChannel(int channnel){
//        setChannel = channnel;
//    }

//    코드 작성 최대,최소 채널, 볼륨일때 메세지 보내기

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        if (channel < MIN_CHANNEL) {
            channel = MAX_CHANNEL;
            System.out.println("max 체널로 변경합니다.");
        } else if (channel > MAX_CHANNEL) {
            channel = MIN_CHANNEL;
            System.out.println("min 체널로 변경합니다.");
        }
        prevChannel = this.channel;
        this.channel = channel;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume > MAX_VOLUME || volume < MIN_VOLUME) {
            return;
        }
        this.volume = volume;
    }


    //코드작성 이전체널로이동
    void gotoPrevChannel() {
        setChannel(prevChannel);
    }
}


public class Exercise7_4 {
    public static void main(String[] args){
        MyTv t = new MyTv();

        t.setVolume(10);
        System.out.println("VOL:" + t.getVolume());
        t.setChannel(10);
        System.out.println("CH:" + t.getChannel());
        t.setChannel(20);
        System.out.println("CH:" + t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH:" + t.getChannel());
        t.gotoPrevChannel();
        System .out.println("CH:" + t.getChannel());
    }
}
