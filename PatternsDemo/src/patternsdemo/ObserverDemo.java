package patternsdemo;

import observer.MyTopic;
import observer.MyTopicSubscriber;
import observer.TopicListner;

/**
 *
 * @author ashok
 */
public class ObserverDemo {

    public static void main(String[] args) {
        MyTopic topic = new MyTopic();

        //create observers
        TopicListner obj1 = new MyTopicSubscriber("Obj1");
        TopicListner obj2 = new MyTopicSubscriber("Obj2");
        TopicListner obj3 = new MyTopicSubscriber("Obj3");

        //register observers to the subject
        topic.registerObserver(obj1);
        topic.registerObserver(obj2);
        topic.registerObserver(obj3);

        //now send message to subject
        topic.postMessage("New Message");
    }
}
