import observer.MobileApp;
import observer.Subscriber;
import observer.Website;
import publisher.Publisher;
import publisher.WeatherApi;

public class Main {
    public static void main(String[] args) {
        //create a publisher
        Publisher weatherApi = new WeatherApi();
        //create list of subscribers
        Subscriber mobile = new MobileApp();
        Subscriber site = new Website();
        //assign subscribers to a publisher
        weatherApi.addSubscriber(mobile);
        weatherApi.addSubscriber(site);
        //notify subscribers of some change
        weatherApi.notifyAllSubscribers("This message is meant to reach both mobile and web end-points.");
        //remove one of the subscribers
        weatherApi.removeSubscriber(mobile);
        //re-post another change
        weatherApi.notifyAllSubscribers("This message is send to websites only.");
    }
}