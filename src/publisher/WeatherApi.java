package publisher;

import observer.Subscriber;

import java.util.List;

//controller for weather api
public class WeatherApi implements Publisher {

    //create list of subscribers
    List<Subscriber> subscriberList;

    //DI
    public WeatherApi(List<Subscriber> subscriberList) {
        this.subscriberList = subscriberList;
    }

    @Override
    public void addSubscriber(Subscriber subscriber) {
        subscriberList.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        if (subscriberList.contains(subscriber))
            subscriberList.remove(subscriber);
        else
            throw new RuntimeException("Subscriber not present in subscriber list");
    }

    @Override
    public void notifyAllSubscribers(String data) {
        //iterate through list of subscribers and update their values
        for (Subscriber subscriber : subscriberList)
            subscriber.update(data);
    }
}
