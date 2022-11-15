package abstracts;

import implementation.Device;

public class Remote {
    Device device;

    public Remote(Device device) {
        this.device = device;
    }

    public void togglePower() {
        if (device.isEnabled())
            device.enable();
        else
            device.disable();
    }

    public void volumeDown() {
        device.decrementVolume();
    }

    public void volumeUp() {
        device.incrementVolume();
    }

    public void channelUp() {
        device.incrementChannel();
    }

    public void channelDown() {
        device.decrementChannel();
    }

}
