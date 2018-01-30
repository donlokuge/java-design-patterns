package observer;

/**
 *
 * @author ashok
 */
public interface Topic {

    public void registerObserver(TopicListner o);

    public void removeObserver(TopicListner o);

    public void notifyObservers();
}
