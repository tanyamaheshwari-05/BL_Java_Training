package Observer;

public class Main {
    public static void main(String[] args) {
        
    
    YoutubeChannel channel=new YoutubeChannel();
    Subscriber tanya= new Subscriber("Tanya");
    channel.subscribe(tanya);
    channel.notifyChanges("Learn design pattern");

}
}