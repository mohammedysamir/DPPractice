package implementation;

public interface Device {
    boolean isEnabled();
    void enable();
    void disable();
    int getVolume();
    void setVolume(int volume);
    int getChannel();
    void setChannel(int channel);
    void incrementVolume();
    void decrementVolume();
    void incrementChannel();
    void decrementChannel();
}
