package abstracts;

import implementation.Device;

public class Remote {
    Device device;

    public Remote(Device device) {
        this.device = device;
    }

    public void togglePower() {
        if (!device.isEnabled())
            device.enable();
        else
            device.disable();
    }

    public void volumeDown() {
        if (device.isEnabled())
            device.decrementVolume();
    }

    public void volumeUp() {
        if (device.isEnabled())
            device.incrementVolume();
    }

    public void channelUp() {
        if (device.isEnabled())
            device.incrementChannel();
    }

    public void channelDown() {
        if (device.isEnabled())
            device.decrementChannel();
    }

}
