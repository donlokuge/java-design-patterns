package observer;

/**
 *
 * @author ashok
 */
public class MyTopicSubscriber implements TopicListner {

    private final String name;

    public MyTopicSubscriber(String nm) {
        this.name = nm;
    }

    @Override
    public void update(String record) {

        System.out.println(name + ":: Consuming message::" + record);
    }

}
