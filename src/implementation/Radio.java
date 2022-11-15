package implementation;

public class Radio implements Device {
    int channel;
    int numberOfChannels;
    int volume;
    boolean isEnabled;

    public Radio(int channel, int volume, int maximumNumberOfChannels) {
        this.channel = channel;
        this.volume = volume;
        this.numberOfChannels = maximumNumberOfChannels;
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


    @Override
    public void incrementVolume() {
        if (volume < 100)
            volume++;
        System.out.println("Radio volume incremented to: " + volume);
    }

    @Override
    public void decrementVolume() {
        if (volume > 0)
            volume--;
        System.out.println("Radio volume decremented to: " + volume);
    }

    @Override
    public void incrementChannel() {
        channel = (channel + 1) % numberOfChannels;
        System.out.println("Radio channel incremented to: " + channel);
    }

    @Override
    public void decrementChannel() {
        channel = (channel - 1) % numberOfChannels;
        System.out.println("Radio channel decremented to: " + channel);
    }
}
