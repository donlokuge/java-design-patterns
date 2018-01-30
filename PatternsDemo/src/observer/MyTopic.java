package observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ashok
 */
public class MyTopic implements Topic {

    private List<TopicListner> observers;
    private final Object MUTEX = new Object();
    private String message;
    private boolean changed;

    public MyTopic() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(TopicListner obj) {
        if (obj == null) {
            throw new NullPointerException("Null Observer");
        }
        synchronized (MUTEX) {
            if (!observers.contains(obj)) {
                observers.add(obj);
            }
        }
    }

    @Override
    public void removeObserver(TopicListner obj) {
        synchronized (MUTEX) {
            observers.remove(obj);
        }
    }

    @Override
    public void notifyObservers() {
        List<TopicListner> observersLocal = null;
        //synchronization is used to make sure any observer registered after message is received is not notified
        synchronized (MUTEX) {
            if (!changed) {
                return;
            }
            observersLocal = new ArrayList<>(this.observers);
            this.changed = false;
        }
        for (TopicListner obj : observersLocal) {
            obj.update(this.message);
        }
    }
//method to post message to the topic

    public void postMessage(String msg) {
        System.out.println("Message Posted to Topic:" + msg);
        this.message = msg;
        this.changed = true;
        notifyObservers();
    }
}
