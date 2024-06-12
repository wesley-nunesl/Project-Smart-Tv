public class SmartTv {
    boolean connected = false;
    int channel = 1;
    int volume = 25;

    public void open(){
        connected = true;
    } 
    public void close(){
        connected = false;
    }

    public void upVolume(){
        volume ++;
    }

    public void downVolume(){
        volume --;
    }

    public void upChannel(){
        channel ++;
    }

    public void downChannel(){
        channel --;
    }

    public void changeChannel(int newChannel){
        this.channel = newChannel;
    }
}
