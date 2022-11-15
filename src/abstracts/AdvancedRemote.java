package abstracts;

import implementation.Device;

public class AdvancedRemote extends Remote {
    public AdvancedRemote(Device device) {
        super(device);
    }

    public void mute() {
        this.device.setVolume(0);
    }
}
