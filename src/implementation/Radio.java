package implementation;

public class Radio implements Device {
    int channel;
    int volume;
    boolean isEnabled;

    public Radio(int channel, int volume) {
        this.channel = channel;
        this.volume = volume;
        isEnabled = false;
    }

    @Override
    public boolean isEnabled() {
        return isEnabled;
    }

    @Override
    public void enable() {
        System.out.println("Radio turn on");
        isEnabled = true;
    }

    @Override
    public void disable() {
        System.out.println("Radio turn off");
        isEnabled = false;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
    }
}
