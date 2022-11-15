import abstracts.AdvancedRemote;
import abstracts.Remote;
import implementation.Device;
import implementation.Radio;
import implementation.TV;

public class Main {
    public static void main(String[] args) {
        //define a concrete impl
        Device tv = new TV(1,20,5);
        //set remote
        Remote remote = new Remote(tv);
        remote.togglePower();
        remote.channelUp();
        remote.channelDown();
        remote.volumeDown();
        remote.volumeDown();
        remote.volumeUp();
        remote.togglePower();

        //----define another device and an advanced remote
        Device radio = new Radio(89,1,10);
        remote = new AdvancedRemote(radio);
        remote.togglePower();
        remote.channelUp();
        remote.channelDown();
        remote.volumeDown();
        remote.volumeDown();
        remote.volumeUp();
        remote.togglePower();
    }
}
/*
* Bridge:
*   - is used to separate to related objects/classes that can be developed independently.
*   - if we use inheritance to extend classes this will cause a mess if each we added new attribute or property that need to be extended
*       - example: Shape -> Circle, Square, and we added color to the basic shape
*       - Shape -> RedCircle, BlueCircle, RedSquare, BlueSquare .....
*       - each time we add new shape we need to add 2 extra classes.
*       - each time we add new color we need to add n classes one-for-each-shape
* */