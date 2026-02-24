package Observer;

import java.util.*;

public class YoutubeChannel implements Subject {

    List<Observer> subscriber= new ArrayList<>();

    @Override
    public void notifyChanges(String title) {
        for(Observer ob:subscriber){
            ob.notified(title);
        }
    }

    @Override
    public void subscribe(Observer ob) {
        this.subscriber.add(ob);        
    }

    @Override
    public void unsubscribe(Observer ob) {
        this.subscriber.remove(ob);
        
    }
    
}
