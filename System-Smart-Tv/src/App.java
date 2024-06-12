public class App {
    public static void main(String[] args) throws Exception {
        

        SmartTv smartTv = new SmartTv();

        System.out.println("TV Connected ?" + smartTv.connected);
        System.out.println("Current Channel: " + smartTv.channel);
        System.out.println("Current Volume: " + smartTv.volume);

        smartTv.open();
        System.out.println("New Status -> TV Connected ?" + smartTv.connected);

        
        smartTv.downVolume();
        System.out.println("New Status -> New Volume: " + smartTv.volume);

        smartTv.changeChannel(205);
        System.out.println("New Status -> New Channel: " + smartTv.channel);
    }
}
